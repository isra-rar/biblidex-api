package com.rodgisra.biblidexapi.util;

import com.rodgisra.biblidexapi.model.*;
import com.rodgisra.biblidexapi.model.Character;
import com.rodgisra.biblidexapi.repository.CharacterRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DataLoader implements CommandLineRunner {

    private final CharacterRepository characterRepository;

    public DataLoader(CharacterRepository characterRepository) {
        this.characterRepository = characterRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        if (characterRepository.count() == 0) {
            characterRepository.saveAll(List.of(
                    new Character(null, "Adão", Povo.HEBREU, Livro.GENESIS, Testamento.ANTIGO, Tribo.NENHUMA, "O primeiro homem criado por Deus"),
                    new Character(null, "Eva", Povo.HEBREU, Livro.GENESIS, Testamento.ANTIGO, Tribo.NENHUMA, "A primeira mulher criada por Deus"),
                    new Character(null, "Noé", Povo.HEBREU, Livro.GENESIS, Testamento.ANTIGO, Tribo.NENHUMA, "Construiu a arca para sobreviver ao dilúvio"),
                    new Character(null, "Abraão", Povo.HEBREU, Livro.GENESIS, Testamento.ANTIGO, Tribo.NENHUMA, "Pai de nações e amigo de Deus"),
                    new Character(null, "Sara", Povo.HEBREU, Livro.GENESIS, Testamento.ANTIGO, Tribo.NENHUMA, "Esposa de Abraão e mãe de Isaque"),
                    new Character(null, "Isaque", Povo.HEBREU, Livro.GENESIS, Testamento.ANTIGO, Tribo.NENHUMA, "Filho de Abraão e pai de Jacó e Esaú"),
                    new Character(null, "Rebeca", Povo.HEBREU, Livro.GENESIS, Testamento.ANTIGO, Tribo.NENHUMA, "Esposa de Isaque e mãe de Jacó e Esaú"),
                    new Character(null, "Jacó", Povo.HEBREU, Livro.GENESIS, Testamento.ANTIGO, Tribo.NENHUMA, "Pai das 12 tribos de Israel"),
                    new Character(null, "José", Povo.HEBREU, Livro.GENESIS, Testamento.ANTIGO, Tribo.MANASSES, "Interpretou sonhos e salvou o Egito da fome"),
                    new Character(null, "Moisés", Povo.HEBREU, Livro.EXODO, Testamento.ANTIGO, Tribo.LEVI, "Liderou o povo de Israel na saída do Egito"),
                    new Character(null, "Josué", Povo.HEBREU, Livro.JOSUE, Testamento.ANTIGO, Tribo.EFRAIM, "Líder após Moisés, levou Israel à Terra Prometida"),
                    new Character(null, "Davi", Povo.HEBREU, Livro.SAMUEL_1, Testamento.ANTIGO, Tribo.JUDA, "Rei de Israel e escritor de Salmos"),
                    new Character(null, "Salomão", Povo.HEBREU, Livro.REIS_1, Testamento.ANTIGO, Tribo.JUDA, "Rei conhecido por sua sabedoria"),
                    new Character(null, "Maria", Povo.JUDEU, Livro.MATEUS, Testamento.NOVO, Tribo.NENHUMA, "Mãe de Jesus Cristo"),
                    new Character(null, "Jesus", Povo.JUDEU, Livro.MATEUS, Testamento.NOVO, Tribo.JUDA, "O Messias, Salvador do mundo"),
                    new Character(null, "Pedro", Povo.JUDEU, Livro.MATEUS, Testamento.NOVO, Tribo.NENHUMA, "Apóstolo de Jesus, também chamado Simão"),
                    new Character(null, "Paulo", Povo.JUDEU, Livro.ATOS, Testamento.NOVO, Tribo.BENJAMIM, "Apóstolo dos gentios e escritor de cartas"),
                    new Character(null, "Jacó", Povo.HEBREU, Livro.GENESIS, Testamento.ANTIGO, Tribo.BENJAMIM, "Pai das doze tribos de Israel"),
                    new Character(null, "José", Povo.HEBREU, Livro.GENESIS, Testamento.ANTIGO, Tribo.BENJAMIM, "Filho de Jacó vendido como escravo, tornou-se governador do Egito"),
                    new Character(null, "Moisés", Povo.HEBREU, Livro.EXODO, Testamento.ANTIGO, Tribo.LEVI, "Líder que libertou Israel do Egito"),
                    new Character(null, "Arão", Povo.HEBREU, Livro.EXODO, Testamento.ANTIGO, Tribo.LEVI, "Irmão de Moisés, primeiro sumo sacerdote de Israel"),
                    new Character(null, "Josué", Povo.HEBREU, Livro.JOSUE, Testamento.ANTIGO, Tribo.EFRAIM, "Conduziu Israel à Terra Prometida após Moisés"),
                    new Character(null, "Débora", Povo.HEBREU, Livro.JUIZES, Testamento.ANTIGO, null, "Profetisa e juíza que liderou Israel à vitória contra os cananeus"),
                    new Character(null, "Rute", Povo.MOABITA, Livro.RUTE, Testamento.ANTIGO, null, "Moabita que se tornou parte da linhagem de Jesus"),
                    new Character(null, "Samuel", Povo.HEBREU, Livro.SAMUEL_1, Testamento.ANTIGO, Tribo.EFRAIM, "Último juiz e primeiro profeta de Israel"),
                    new Character(null, "Davi", Povo.HEBREU, Livro.SAMUEL_1, Testamento.ANTIGO, Tribo.JUDA, "Rei de Israel, conhecido como homem segundo o coração de Deus"),
                    new Character(null, "Salomão", Povo.HEBREU, Livro.SAMUEL_2, Testamento.ANTIGO, Tribo.JUDA, "Filho de Davi, famoso por sua sabedoria"),
                    new Character(null, "Elias", Povo.HEBREU, Livro.REIS, Testamento.ANTIGO, null, "Profeta que confrontou os profetas de Baal"),
                    new Character(null, "Eliseu", Povo.HEBREU, Livro.REIS, Testamento.ANTIGO, null, "Sucessor de Elias com muitos milagres registrados"),
                    new Character(null, "Isaías", Povo.HEBREU, Livro.ISAIAS, Testamento.ANTIGO, null, "Profeta que anunciou a vinda do Messias"),
                    new Character(null, "Jeremias", Povo.HEBREU, Livro.JEREMIAS, Testamento.ANTIGO, null, "Profeta conhecido como o profeta chorão"),
                    new Character(null, "Daniel", Povo.HEBREU, Livro.DANIEL, Testamento.ANTIGO, null, "Profeta que interpretou sonhos no exílio babilônico"),
                    new Character(null, "Maria", Povo.JUDEU, Livro.MATEUS, Testamento.NOVO, null, "Mãe de Jesus"),
                    new Character(null, "Pedro", Povo.JUDEU, Livro.MATEUS, Testamento.NOVO, null, "Apóstolo de Jesus e líder da Igreja primitiva"),
                    new Character(null, "João", Povo.JUDEU, Livro.JOAO, Testamento.NOVO, null, "Apóstolo e autor do Apocalipse"),
                    new Character(null, "Paulo", Povo.JUDEU, Livro.ATOS, Testamento.NOVO, Tribo.BENJAMIM, "Apóstolo dos gentios"),
                    new Character(null, "Lídia", Povo.GREGO, Livro.ATOS, Testamento.NOVO, null, "Primeira convertida na Europa pelo ministério de Paulo"),
                    new Character(null, "Priscila", Povo.JUDEU, Livro.ATOS, Testamento.NOVO, null, "Companheira de Paulo e esposa de Aquila"),
                    new Character(null, "Judas Iscariotes", Povo.JUDEU, Livro.MATEUS, Testamento.NOVO, null, "Apóstolo que traiu Jesus por 30 moedas de prata"),
                    new Character(null, "Onésimo", Povo.GREGO, Livro.FILEMON, Testamento.NOVO, null, "Escravo fugitivo convertido ao cristianismo por Paulo")
            ));
            System.out.println("Dados dos personagens foram inseridos com sucesso.");
        } else {
            System.out.println("Os dados já estão preenchidos no banco de dados.");
        }
    }
}
