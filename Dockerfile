# Etapa 1: Construir a aplicação usando uma imagem Maven
FROM maven:3.8.7-eclipse-temurin-17 AS build

# Define o diretório de trabalho dentro do container
WORKDIR /app

# Copia o arquivo pom.xml e outros arquivos de configuração necessários
COPY pom.xml ./

# Baixa as dependências do Maven
RUN mvn dependency:go-offline -B

# Copia o código-fonte da aplicação
COPY src ./src

# Compila a aplicação e gera o arquivo JAR
RUN mvn clean package -DskipTests

# Etapa 2: Criar a imagem final usando uma imagem JDK menor
FROM eclipse-temurin:17-jre-jammy

# Define o diretório de trabalho dentro do container
WORKDIR /app

# Copia o JAR da aplicação gerado na etapa anterior
COPY --from=build /app/target/*.jar biblidex-api-0.0.1-SNAPSHOT.jar

# Define a variável de ambiente para o Spring Boot usar a porta 8080
ENV PORT 8080

# Expõe a porta 8080 do container
EXPOSE 8080

# Define o comando de inicialização da aplicação
ENTRYPOINT ["java", "-jar", "biblidex-api-0.0.1-SNAPSHOT.jar"]