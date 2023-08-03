package com.example.data

import com.example.domain.model.*
import com.example.domain.repository.FootballRepository

class FootballRepositoryMock : FootballRepository {

    val aaa = R.drawable.utd

    override fun getCountry(): List<CountryModel> = listOf(
        CountryModel("England", "Премьер Лига", "1", R.drawable.apl),
        CountryModel("Germany", "Бундес Лига", "2", R.drawable.bundes),
        CountryModel("Spain", "Ла Лига", "3", R.drawable.laliga),
        CountryModel("Russia", "Премьер Лига", "1", R.drawable.russiapremerliga),
        CountryModel("France", "Лига 1", "2", R.drawable.liga1),
        CountryModel("Italy", "Серия А", "3", R.drawable.seriaa))

    override fun getClubsForCountry(country: String): List<ClubName> = when (country) {
        "England" -> listOf(ClubName("Chelsea", R.drawable.chelsea),
            ClubName("Liverpool", R.drawable.liverpool),
            ClubName("Arsenal", R.drawable.arsenal),
            ClubName("Manchester City", R.drawable.city),
            ClubName("Manchester Unt", R.drawable.utd),
            ClubName("Newcastle", R.drawable.newkastle),
            )

        "Germany" -> listOf(ClubName("Bavaria", R.drawable.bavaria),
            ClubName("Gerta", R.drawable.gerta),
            ClubName("Dortmund", R.drawable.borussia),
            ClubName("Shalke 04", R.drawable.shalke),
            ClubName("Leipzig", R.drawable.leipzig),
            ClubName("Stuttgart", R.drawable.stuttgart)
            )

        "Spain" -> listOf(ClubName("RealMadrid", R.drawable.real),
            ClubName("Barselona", R.drawable.barsa),
            ClubName("Villareal", R.drawable.villareal),
            ClubName("Sevilla ", R.drawable.sevilla),
            ClubName("Betis", R.drawable.betis),
            ClubName("Athletic Bilbao", R.drawable.bilbao)
            )

        "Russia" -> listOf(ClubName("Spartak", R.drawable.spatrak),
                ClubName("Lokomotiv", R.drawable.lokomotiv),
                ClubName("Krasnodar", R.drawable.krasnodar),
            ClubName("Zenit", R.drawable.zenit),
            ClubName("Rostov", R.drawable.rostov),
            ClubName("Sochi", R.drawable.sochi)

            )

        "France" -> listOf(ClubName("PSG", R.drawable.psg),
            ClubName("Monako", R.drawable.monako),
            ClubName("Lion", R.drawable.lion),
            ClubName("Lille", R.drawable.lille),
            ClubName("Nantes", R.drawable.nantes),
            ClubName("Marseille", R.drawable.marseille)
            )

        "Italy" -> listOf(ClubName("Inter", R.drawable.inter),
            ClubName("Juventus", R.drawable.juventus),
            ClubName("Roma", R.drawable.roma),
            ClubName("Napoli", R.drawable.napoli),
            ClubName("Lazio", R.drawable.lazio),
            ClubName("Atalanta", R.drawable.atalanta))

        else -> emptyList()
    }

    override fun getClubs(club: String): List<ClubDetailModel> = when (club) {
        "Chelsea" -> listOf(
            ClubDetailModel("Chelsea", R.drawable.chelsea, "England", "Stamford Bridge",  R.drawable.chelseastadium,"4",
            58000, "15.02.1932", 36, "Enrike", R.drawable.lewandovski,
            2, 8,))
        "Liverpool" -> listOf(
            ClubDetailModel("Liverpool", R.drawable.liverpool, "England", "Anfield Road",
                R.drawable.liverpoolstadium,"4", 48056, "18.10.1954", 25,
            "Enrik", R.drawable.lewandovski, 1, 8))
        "Arsenal" -> listOf(
            ClubDetailModel("Arsenal", R.drawable.arsenal, "England", "Emirates Stadium"
                , R.drawable.arsenalstadium,"4", 41068, "10.06.1953", 8,
            "Enrik", R.drawable.lewandovski, 2, 6))

        "Manchester City" -> listOf(
            ClubDetailModel("Manchester City", R.drawable.chelsea, "England", "Stamford Bridge",  R.drawable.chelseastadium,"4",
                58000, "15.02.1932", 36, "Enrike", R.drawable.lewandovski,
                2, 8,))
        "Manchester Unt" -> listOf(
            ClubDetailModel("Manchester Unt", R.drawable.liverpool, "England", "Anfield Road",
                R.drawable.liverpoolstadium,"4", 48056, "18.10.1954", 25,
                "Enrik", R.drawable.lewandovski, 1, 8))
        "Newcastle" -> listOf(
            ClubDetailModel("Newcastle", R.drawable.arsenal, "England", "Emirates Stadium"
                , R.drawable.arsenalstadium,"4", 41068, "10.06.1953", 8,
                "Enrik", R.drawable.lewandovski, 2, 6))

        "Bavaria" -> listOf(
            ClubDetailModel("Bavaria", R.drawable.bavaria, "Germany", "Allianz Arena",
                R.drawable.bavariastadium,"4", 41856, "05.10.1921", 30,
            "Enrik", R.drawable.lewandovski, 5, 12))
        "Dortmund" -> listOf(
            ClubDetailModel("Dortmund", R.drawable.borussia, "Germany", "SIGNAL IDUNA PARK"
                , R.drawable.burussiastadium,"4", 41987, "14.06.1961", 4,
            "enrik", R.drawable.lewandovski, 0, 2))
        "Gerta" -> listOf(
            ClubDetailModel("Gerta", R.drawable.gerta, "Germany", "Olympiastadion Berlin",
                R.drawable.gertastadium, "4", 32589, "19.07.1982", 4,
            "enrik", R.drawable.lewandovski, 0, 0, ))

        "Shalke 04" -> listOf(
            ClubDetailModel("Shalke 04", R.drawable.bavaria, "Germany", "Allianz Arena",
                R.drawable.bavariastadium,"4", 41856, "05.10.1921", 30,
                "Enrik", R.drawable.lewandovski, 5, 12))
        "Leipzig" -> listOf(
            ClubDetailModel("Leipzig", R.drawable.borussia, "Germany", "SIGNAL IDUNA PARK"
                , R.drawable.burussiastadium,"4", 41987, "14.06.1961", 4,
                "enrik", R.drawable.lewandovski, 0, 2))
        "Stuttgart" -> listOf(
            ClubDetailModel("Stuttgart", R.drawable.gerta, "Germany", "Olympiastadion Berlin",
                R.drawable.gertastadium, "4", 32589, "19.07.1982", 4,
                "enrik", R.drawable.lewandovski, 0, 0, ))

        "RealMadrid" -> listOf(
            ClubDetailModel("RealMadrid", R.drawable.real, "Spain", "Santiago Bernabéu",
                R.drawable.realsradium,"4", 67896, "12.10.1910", 40,
            "enrik", R.drawable.lewandovski, 12, 23))
        "Barselona" -> listOf(
            ClubDetailModel("Barselona", R.drawable.barsa, "Spain", "Camp Nou",
                R.drawable.campnou,"4", 59123, "19.07.1924", 28,
            "enrik", R.drawable.lewandovski, 7, 18))
        "Villareal" -> listOf(
            ClubDetailModel("Villareal",R.drawable.villareal , "Spain", "La Ceramica",
                R.drawable.villarealstadium, "4", 21963, "12.05.1974", 10,
            "enrik", R.drawable.lewandovski, 1, 0))


        "Sevilla" -> listOf(
            ClubDetailModel("Sevilla", R.drawable.real, "Spain", "Santiago Bernabéu",
                R.drawable.realsradium,"4", 67896, "12.10.1910", 40,
                "enrik", R.drawable.lewandovski, 12, 23))
        "Betis" -> listOf(
            ClubDetailModel("Betis", R.drawable.barsa, "Spain", "Camp Nou",
                R.drawable.campnou,"4", 59123, "19.07.1924", 28,
                "enrik", R.drawable.lewandovski, 7, 18))
        "Athletic Bilbao" -> listOf(
            ClubDetailModel("Athletic Bilbao",R.drawable.villareal , "Spain", "La Ceramica",
                R.drawable.villarealstadium, "4", 21963, "12.05.1974", 10,
                "enrik", R.drawable.lewandovski, 1, 0))

        "PSG" -> listOf(
            ClubDetailModel("PSG", R.drawable.psg, "France", "Stamford Bridge",  R.drawable.chelseastadium,"4",
                58000, "15.02.1932", 36, "Enrike", R.drawable.lewandovski,
                2, 8,))
        "Monako" -> listOf(
            ClubDetailModel("Monako", R.drawable.monako, "France", "Anfield Road",
                R.drawable.liverpoolstadium,"4", 48056, "18.10.1954", 25,
                "Enrik", R.drawable.lewandovski, 1, 8))
        "Lion" -> listOf(
            ClubDetailModel("Lion", R.drawable.lion, "France", "Emirates Stadium"
                , R.drawable.arsenalstadium,"4", 41068, "10.06.1953", 8,
                "Enrik", R.drawable.lewandovski, 2, 6))


        "Lille" -> listOf(
            ClubDetailModel("Lille", R.drawable.psg, "France", "Stamford Bridge",  R.drawable.chelseastadium,"4",
                58000, "15.02.1932", 36, "Enrike", R.drawable.lewandovski,
                2, 8,))
        "Nantes" -> listOf(
            ClubDetailModel("Nantes", R.drawable.monako, "France", "Anfield Road",
                R.drawable.liverpoolstadium,"4", 48056, "18.10.1954", 25,
                "Enrik", R.drawable.lewandovski, 1, 8))
        "Marseille" -> listOf(
            ClubDetailModel("Marseille", R.drawable.lion, "France", "Emirates Stadium"
                , R.drawable.arsenalstadium,"4", 41068, "10.06.1953", 8,
                "Enrik", R.drawable.lewandovski, 2, 6))

        "Spartak" -> listOf(
            ClubDetailModel("Spartak", R.drawable.spatrak, "Russia", "Allianz Arena",
                R.drawable.bavariastadium,"4", 41856, "05.10.1921", 30,
                "Enrik", R.drawable.lewandovski, 5, 12))
        "Krasnodar" -> listOf(
            ClubDetailModel("Krasnodar", R.drawable.borussia, "Russia", "SIGNAL IDUNA PARK"
                , R.drawable.burussiastadium,"4", 41987, "14.06.1961", 4,
                "enrik", R.drawable.lewandovski, 0, 2))
        "Lokomotiv" -> listOf(
            ClubDetailModel("Lokomotiv", R.drawable.gerta, "Russia", "Olympiastadion Berlin",
                R.drawable.gertastadium, "4", 32589, "19.07.1982", 4,
                "enrik", R.drawable.lewandovski, 0, 0, ))

        "Zenit" -> listOf(
            ClubDetailModel("Zenit", R.drawable.spatrak, "Russia", "Allianz Arena",
                R.drawable.bavariastadium,"4", 41856, "05.10.1921", 30,
                "Enrik", R.drawable.lewandovski, 5, 12))
        "Rostov" -> listOf(
            ClubDetailModel("Rostov", R.drawable.borussia, "Russia", "SIGNAL IDUNA PARK"
                , R.drawable.burussiastadium,"4", 41987, "14.06.1961", 4,
                "enrik", R.drawable.lewandovski, 0, 2))
        "Sochi" -> listOf(
            ClubDetailModel("Sochi", R.drawable.gerta, "Russia", "Olympiastadion Berlin",
                R.drawable.gertastadium, "4", 32589, "19.07.1982", 4,
                "enrik", R.drawable.lewandovski, 0, 0, ))


        "Inter" -> listOf(
            ClubDetailModel("Inter", R.drawable.inter, "Italy", "Santiago Bernabéu",
                R.drawable.realsradium,"4", 67896, "12.10.1910", 40,
                "enrik", R.drawable.lewandovski, 12, 23))
        "Juventus" -> listOf(
            ClubDetailModel("Juventus", R.drawable.juventus, "Italy", "Camp Nou",
                R.drawable.campnou,"4", 59123, "19.07.1924", 28,
                "enrik", R.drawable.lewandovski, 7, 18))
        "Roma" -> listOf(
            ClubDetailModel("Roma",R.drawable.roma , "Italy", "La Ceramica",
                R.drawable.villarealstadium, "4", 21963, "12.05.1974", 10,
                "enrik", R.drawable.lewandovski, 1, 0))

        "Napoli" -> listOf(
            ClubDetailModel("Napoli", R.drawable.inter, "Italy", "Santiago Bernabéu",
                R.drawable.realsradium,"4", 67896, "12.10.1910", 40,
                "enrik", R.drawable.lewandovski, 12, 23))
        "Lazio" -> listOf(
            ClubDetailModel("Lazio", R.drawable.juventus, "Italy", "Camp Nou",
                R.drawable.campnou,"4", 59123, "19.07.1924", 28,
                "enrik", R.drawable.lewandovski, 7, 18))
        "Atalanta" -> listOf(
            ClubDetailModel("Atalanta",R.drawable.roma , "Italy", "La Ceramica",
                R.drawable.villarealstadium, "4", 21963, "12.05.1974", 10,
                "enrik", R.drawable.lewandovski, 1, 0))
        else -> emptyList()
    }

    override fun getPlayersDetails(name: String): List<PlayerModel> = when (name) {
        "Кепа Аррисабалага" -> listOf(
            PlayerModel("Кепа Аррисабалага", R.drawable.kepa,
                "Spain", "Защитник", 5, 125, 7))
        "Маркус Беттинелли" -> listOf(
            PlayerModel("Маркус Беттинелли", R.drawable.img,
                "England", "Вратарь", 2, 14, 0))
        "Михаил Мудрик" -> listOf(
            PlayerModel("Михаил Мудрик", R.drawable.mudrik,
                "Украина", "Полузащитник", 8, 21, 8))
        "Кристофер Нкунку" -> listOf(
            PlayerModel("Кристофер Нкунку", R.drawable.nkuku,
                "Нигерия", "Полузащитник", 6, 18, 2))

        "Тиаго Силва" -> listOf(PlayerModel("Тиаго Силва", R.drawable.mudrik,
            "Бразилия", "Защитник", 4, 29, 0),

        )

        "Курт Зума" -> listOf(PlayerModel("Курт Зума", R.drawable.mudrik,
            "Франция", "Защитник", 5, 35, 3),

            )

        "Нголо Канте" -> listOf(PlayerModel("Курт Зума", R.drawable.mudrik,
            "Франция", "Защитник", 5, 35, 3),
            )

        "Мэйсон Маунт" -> listOf(PlayerModel("Мэйсон Маунт", R.drawable.mudrik,
            "Англия", "Полузащитник", 7, 36, 6),
            )
        "Кай Хаверц" -> listOf(PlayerModel("Кай Хаверц", R.drawable.mudrik,
            "Германия", "Полузащитник", 8, 34, 4),
        )
        "Кристиан Пулишич" -> listOf(PlayerModel("Кристиан Пулишич", R.drawable.mudrik,
            "США", "Полузащитник", 10, 27, 6),
        )
        "Тимо Вернер" -> listOf(PlayerModel("Тимо Вернер", R.drawable.mudrik,
            "Германия", "Нападающий", 11, 35, 12),
        )
        "Ромеру Лукаку" -> listOf(PlayerModel("Ромеру Лукаку", R.drawable.mudrik,
            "Бельгия", "Нападающий", 9, 35, 21),
        )
        "Эдуард Менди" -> listOf(PlayerModel("Эдуард Менди", R.drawable.mudrik,
            "Сенегал", "Вратарь", 1, 32, 0),
        )
        "Салах" -> listOf(
            PlayerModel("Салах", R.drawable.salah,
                "Египет", "Нападающий", 9, 38, 30))
        "Алиссон" -> listOf(
            PlayerModel("Алиссон", R.drawable.alisson,
                "Бразилия", "Вратарь", 1, 38, 0))
        "Хендерсон" -> listOf(
            PlayerModel("Хендерсон", R.drawable.henderson,
                "Англия", "Полузащитник", 12, 38, 8))
        "Ван дейк" -> listOf(
            PlayerModel("Ван дейк", R.drawable.vandeik,
                "Голландия", "Защитник", 4, 38, 4))

        "Фабиньо" -> listOf(PlayerModel("Фабиньо", R.drawable.vandeik, "Бразилия",
                "Полузащитник", 3, 27, 8))

        "Фирмино" -> listOf(PlayerModel("Фирмино", R.drawable.vandeik, "Бразилия",
            "Нападающий", 9, 29, 10))

        "Тиаго Алькантара" -> listOf(PlayerModel("Тиаго Алькантара", R.drawable.vandeik,
            "Испания", "Полузащитник", 6, 30, 14))

        "Джото" -> listOf(PlayerModel("Джото", R.drawable.vandeik, "Португалия", "Нападающий",
            20, 25, 6))

        "Алекс Окслейд-Чемберлен" -> listOf(PlayerModel("Алекс Окслейд-Чемберлен", R.drawable.vandeik, "Англия",
            "Полузащитник", 15, 28, 10))

        "Джеймс Милнер" -> listOf(PlayerModel("Джеймс Милнер", R.drawable.vandeik, "Англия",
            "Полузащитник", 7, 35, 17))

        "Анди Робертсон" -> listOf(PlayerModel("Анди Робертсон", R.drawable.vandeik, "Шотландия",
            "Защитник", 26, 27, 9))

        "Конате" -> listOf(PlayerModel("Конате", R.drawable.vandeik, "Франция",
            "Защитник", 5, 22, 4))

        "Габриэл Жезус" -> listOf(
            PlayerModel("Габриэл Жезус", R.drawable.jesus,
                "Бразилия", "Нападающий", 7, 31, 18))
        "Томас Парти" -> listOf(
            PlayerModel("Томас Парти", R.drawable.parti,
                "Греция", "Защитник", 4, 25, 2))
        "Николя Пепе" -> listOf(
            PlayerModel("Николя Пепе", R.drawable.pepe,
                "Англия", "Полузащитник", 42, 29, 8))
        "Рис Нелсон" -> listOf(
            PlayerModel("Рис Нелсон", R.drawable.nelson,
                "Голландия", "Защитник", 4, 15, 4))

        "Пьер-Эмерик Обамеянг" -> listOf(PlayerModel("Пьер-Эмерик Обамеянг", R.drawable.nelson, "Габон",
                "Нападающий", 14, 32, 15))

        "Александер Ляказетт" -> listOf(PlayerModel("Александер Ляказетт", R.drawable.nelson,
            "Франция", "Нападающий", 9, 30, 7))

        "Букайо Сака" -> listOf(PlayerModel("Букайо Сака", R.drawable.nelson, "Англия",
            "Полузащитник", 7, 19, 3))


        "Киран Тирни" -> listOf(PlayerModel("Киран Тирни", R.drawable.nelson,
            "Шотландия", "Защитник", 3, 24, 6))

        "Гранит Жака" -> listOf(PlayerModel("Гранит Жака", R.drawable.nelson, "Швейцария",
            "Полузащитник", 34, 28, 9))

        "Бернд Лено" -> listOf(PlayerModel("Бернд Лено", R.drawable.nelson, "Германия",
            "Вратарь", 1, 29, 0))


        "Эмил Смит Роу" -> listOf(PlayerModel("Эмил Смит Роу", R.drawable.nelson, "Англия", "Полузащитник", 32, 20, 4))

        "Бернд Лено" -> listOf(PlayerModel("Бернд Лено", R.drawable.nelson, "Германия",
            "Вратарь", 1, 29, 0))


        "Садьо Мане" -> listOf(
            PlayerModel("Садьо Мане", R.drawable.mane,
                "Африка", "Нападающий", 7, 31, 18))
        "Томас Мюллер" -> listOf(
            PlayerModel("Томас Мюллер", R.drawable.muller,
                "Германия", "нападающий", 4, 25, 2))
        "Матис Тель" -> listOf(
            PlayerModel("Матис Тель", R.drawable.tel,
                "Испания", "Нападающий", 42, 29, 8))
        "Райан Гравенберх" -> listOf(
            PlayerModel("Райан Гравенберх", R.drawable.raian,
                "Голландия", "Защитник", 4, 15, 4))

        "Мануэль Нойер" -> listOf(
            PlayerModel("Мануэль Нойер", R.drawable.raian, "Германия",
                "Вратарь", 1, 35, 0))

        "Леон Горецка" -> listOf(
            PlayerModel("Леон Горецка", R.drawable.muller,
                "Германия", "Полузащитник", 18, 26, 8))

        "Давид Алаба" -> listOf(
            PlayerModel("Давид Алаба", R.drawable.muller, "Австрия",
                "Защитник", 27, 29, 2))

        "Никлас Зюле" -> listOf(
            PlayerModel("Никлас Зюле", R.drawable.muller, "Германия", "Защитник", 4, 25, 1))

        "Джером Боатенг" -> listOf(
            PlayerModel("Джером Боатенг", R.drawable.muller, "Германия", "Защитник", 17, 33, 1))

        "Лукас Эрнандес" -> listOf(
            PlayerModel("Джером Боатенг", R.drawable.muller, "Германия", "Защитник", 17, 33, 1))

        "Бенжамен Павар" -> listOf(
            PlayerModel("Бенжамен Павар", R.drawable.muller, "Германия", "Защитник", 17, 33, 1))

        "Джейми Лоренцо" -> listOf(
            PlayerModel("Джейми Лоренцо", R.drawable.muller, "Германия", "Защитник", 17, 33, 1))


        "Thomas Meunier" -> listOf(
            PlayerModel("Thomas Meunier", R.drawable.meunier,
                "Германия", "Нападающий", 7, 31, 18))
        "Mateu Morey Bauzà" -> listOf(
            PlayerModel("Mateu Morey Bauzà",R.drawable.bauza,
                "Польша", "Защитник", 4, 25, 2))
        "Emre Can" -> listOf(
            PlayerModel("Emre Can", R.drawable.can,
                "Турция", "Опорный Полузащитник", 42, 29, 8))
        "Salih Özcan" -> listOf(
            PlayerModel("Salih Özcan", R.drawable.salih,
                "Турция", "Защитник", 4, 15, 4))

        "Mateus Cunha" -> listOf(
            PlayerModel("Mateus Cunha", R.drawable.meunier,
                "Германия", "Нападающий", 7, 31, 18))
        "Dedryck Boyata" -> listOf(
            PlayerModel("Dedryck Boyata",R.drawable.bauza,
                "Польша", "Защитник", 4, 25, 2))
        "Marvin Plattenhardt" -> listOf(
            PlayerModel("Marvin Plattenhardt", R.drawable.can,
                "Турция", "Опорный Полузащитник", 42, 29, 8))
        "Vladimir Darida" -> listOf(
            PlayerModel("Vladimir Darida", R.drawable.salih,
                "Турция", "Защитник", 4, 15, 4))

        "Maximilian Mittelstädt" -> listOf(
            PlayerModel("Maximilian Mittelstädt", R.drawable.meunier,
                "Германия", "Нападающий", 7, 31, 18))
        "Lucas Tousart" -> listOf(
            PlayerModel("Lucas Tousart",R.drawable.bauza,
                "Польша", "Защитник", 4, 25, 2))
        "Nils Körber" -> listOf(
            PlayerModel("Nils Körber", R.drawable.can,
                "Турция", "Опорный Полузащитник", 42, 29, 8))
        "Robert Andrich" -> listOf(
            PlayerModel("Robert Andrich", R.drawable.salih,
                "Турция", "Защитник", 4, 15, 4))

        "Ensar Aksakal" -> listOf(
            PlayerModel("Ensar Aksakal", R.drawable.ensar,
                "Германия", "Нападающий", 7, 31, 18))
        "Dodi Lukébakio" -> listOf(
            PlayerModel("Dodi Lukébakio", R.drawable.dodi,
                "Польша", "Защитник", 4, 25, 2))
        "Marco Richter" -> listOf(
            PlayerModel("Marco Richter", R.drawable.richter,
                "Турция", "Опорный Полузащитник", 42, 29, 8))
        "Palkó Dárdai" -> listOf(
            PlayerModel("Palkó Dárdai", R.drawable.dardai,
                "Турция", "Защитник", 4, 15, 4))

        "Marco Reus" -> listOf(
            PlayerModel("Marco Reus", R.drawable.ensar,
                "Германия", "Нападающий", 7, 31, 18))
        "Jadon Sancho" -> listOf(
            PlayerModel("Jadon Sancho", R.drawable.dodi,
                "Польша", "Защитник", 4, 25, 2))
        "Mats Hummels" -> listOf(
            PlayerModel("Mats Hummels", R.drawable.richter,
                "Турция", "Опорный Полузащитник", 42, 29, 8))
        "Achraf Hakimi" -> listOf(
            PlayerModel("Achraf Hakimi", R.drawable.dardai,
                "Турция", "Защитник", 4, 15, 4))

        "Thorgan Hazard" -> listOf(
            PlayerModel("Thorgan Hazard", R.drawable.ensar,
                "Германия", "Нападающий", 7, 31, 18))
        "Julian Brandt" -> listOf(
            PlayerModel("Julian Brandt", R.drawable.dodi,
                "Польша", "Защитник", 4, 25, 2))
        "Mario Götze" -> listOf(
            PlayerModel("Mario Götze", R.drawable.richter,
                "Турция", "Опорный Полузащитник", 42, 29, 8))
        "Raphael Guerreiro" -> listOf(
            PlayerModel("Raphael Guerreiro", R.drawable.dardai,
                "Турция", "Защитник", 4, 15, 4))

        "Lucas Vázquez" -> listOf(
            PlayerModel("Lucas Vázquez", R.drawable.vaskez,
                "Испания", "Нападающий", 7, 31, 18))
        "Álvaro Odriozola" -> listOf(
            PlayerModel("Álvaro Odriozola", R.drawable.oriadzolo,
                "Польша", "Защитник", 4, 25, 2))
        "Aurélien Tchouaméni" -> listOf(
            PlayerModel("Aurélien Tchouaméni", R.drawable.aurelien,
                "Турция", "Опорный Полузащитник", 42, 29, 8))
        "Jude Bellingham" -> listOf(
            PlayerModel("Jude Bellingham", R.drawable.bellingham,
                "Англия", "Защитник", 4, 15, 4))

        "Vinícius Júnior" -> listOf(
            PlayerModel("Vinícius Júnior", R.drawable.vaskez,
                "Испания", "Нападающий", 7, 31, 18))
        "Rodrygo" -> listOf(
            PlayerModel("Rodrygo", R.drawable.oriadzolo,
                "Польша", "Защитник", 4, 25, 2))
        "Militão" -> listOf(
            PlayerModel("Militão", R.drawable.aurelien,
                "Турция", "Опорный Полузащитник", 42, 29, 8))
        "Díaz" -> listOf(
            PlayerModel("Díaz", R.drawable.bellingham,
                "Англия", "Защитник", 4, 15, 4))

        "Valverde" -> listOf(
            PlayerModel("Valverde", R.drawable.vaskez,
                "Испания", "Нападающий", 7, 31, 18))
        "Ødegaard" -> listOf(
            PlayerModel("Ødegaard", R.drawable.oriadzolo,
                "Польша", "Защитник", 4, 25, 2))
        "Lunin" -> listOf(
            PlayerModel("MiliLunintão", R.drawable.aurelien,
                "Турция", "Опорный Полузащитник", 42, 29, 8))
        "Gutiérrez" -> listOf(
            PlayerModel("Gutiérrez", R.drawable.bellingham,
                "Англия", "Защитник", 4, 15, 4))


        "Марк-Андре тер Стеген" -> listOf(
            PlayerModel("Марк-Андре тер Стеген", R.drawable.terstegen,
                "Испания", "Вратарь", 7, 31, 0))
        "Усман Дембеле" -> listOf(
            PlayerModel("Усман Дембеле", R.drawable.dembele,
                "Франция", "Нападающий", 4, 25, 2))
        "Ферран Торрес" -> listOf(
            PlayerModel("Ферран Торрес", R.drawable.torres,
                "Испания", "Полузащитник", 42, 29, 8))
        "Роберт Левандовски" -> listOf(
            PlayerModel("Роберт Левандовски", R.drawable.lewandovski,
                "Польша", "Нападающий", 4, 15, 11))

        "Griezmann" -> listOf(
            PlayerModel("Griezmann", R.drawable.terstegen,
                "Испания", "Вратарь", 7, 31, 0))
        "Piqué" -> listOf(
            PlayerModel("Piqué", R.drawable.dembele,
                "Франция", "Нападающий", 4, 25, 2))
        "Sergio Busquets" -> listOf(
            PlayerModel("Sergio Busquets", R.drawable.torres,
                "Испания", "Полузащитник", 42, 29, 8))
        "Jordi Alba" -> listOf(
            PlayerModel("Jordi Alba", R.drawable.lewandovski,
                "Польша", "Нападающий", 4, 15, 11))

        "Frenkie de Jong" -> listOf(
            PlayerModel("Frenkie de Jong", R.drawable.terstegen,
                "Испания", "Вратарь", 7, 31, 0))
        "Samuel Umtiti" -> listOf(
            PlayerModel("Samuel Umtiti", R.drawable.dembele,
                "Франция", "Нападающий", 4, 25, 2))
        "Vidal" -> listOf(
            PlayerModel("Vidal", R.drawable.torres,
                "Испания", "Полузащитник", 42, 29, 8))
        "Ivan Rakitić" -> listOf(
            PlayerModel("Ivan Rakitić", R.drawable.lewandovski,
                "Польша", "Нападающий", 4, 15, 11))

            "Франсис Коклен" -> listOf(
            PlayerModel("Франсис Коклен", R.drawable.koklen,
                "Испания", "Полузащитник", 7, 31, 2))
        "Этьен Капу" -> listOf(
            PlayerModel("Этьен Капу", R.drawable.kapu,
                "Франция", "Нападающий", 4, 25, 2))
        "Александр Серлот" -> listOf(
            PlayerModel("Александр Серлот", R.drawable.serlot,
                "Испания", "Полузащитник", 42, 29, 8))
        "Жерар Морено" -> listOf(
            PlayerModel("Жерар Морено", R.drawable.moreno,
                "Польша", "Нападающий", 4, 15, 11))

        "Sergio Asenjo" -> listOf(
            PlayerModel("Sergio Asenjo", R.drawable.koklen,
                "Испания", "Полузащитник", 7, 31, 2))
        "Raúl Albiol" -> listOf(
            PlayerModel("Raúl Albiol", R.drawable.kapu,
                "Франция", "Нападающий", 4, 25, 2))
        "Pau Torres" -> listOf(
            PlayerModel("Pau Torres", R.drawable.serlot,
                "Испания", "Полузащитник", 42, 29, 8))
        "Mario Gaspar" -> listOf(
            PlayerModel("Mario Gaspar", R.drawable.moreno,
                "Польша", "Нападающий", 4, 15, 11))

        "Moisés Gómez" -> listOf(
            PlayerModel("Moisés Gómez", R.drawable.koklen,
                "Испания", "Полузащитник", 7, 31, 2))
        "Samu Castillejo" -> listOf(
            PlayerModel("Samu Castillejo", R.drawable.kapu,
                "Франция", "Нападающий", 4, 25, 2))
        "Dani Parejo" -> listOf(
            PlayerModel("Dani Parejo", R.drawable.serlot,
                "Испания", "Полузащитник", 42, 29, 8))
        "Javi Fuego" -> listOf(
            PlayerModel("Javi Fuego", R.drawable.moreno,
                "Польша", "Нападающий", 4, 15, 11))
        else -> emptyList()
    }

    override fun getPlayers(name: String): List<Players> = when (name) {
        "Chelsea" -> listOf(
            Players("Кепа Аррисабалага", R.drawable.kepa),
            Players("Маркус Беттинелли", R.drawable.img),
            Players("Михаил Мудрик", R.drawable.mudrik),
            Players("Тиаго Силва", R.drawable.nkuku),
            Players("Курт Зума", R.drawable.kepa),
            Players("Мэйсон Маунт", R.drawable.img),
            Players("Кай Хаверц", R.drawable.mudrik),
            Players("Кристиан Пулишич", R.drawable.nkuku),
            Players("Тимо Вернер", R.drawable.kepa),
            Players("Ромеру Лукаку", R.drawable.img),
            Players("Эдуард Менди", R.drawable.mudrik),
            Players("Кристофер Нкунку", R.drawable.nkuku)

        )
        "Liverpool" -> listOf(
            Players("Салах", R.drawable.salah),
            Players("Алиссон", R.drawable.alisson),
            Players("Хендерсон", R.drawable.henderson),
            Players("Ван дейк", R.drawable.vandeik),
            Players("Фабиньо", R.drawable.salah),
            Players("Фирмино", R.drawable.alisson),
            Players("Тиаго Алькантара", R.drawable.henderson),
            Players("Джото", R.drawable.vandeik),
            Players("Алекс Окслейд-Чемберлен", R.drawable.salah),
            Players("Джеймс Милнер", R.drawable.alisson),
            Players("Анди Робертсон", R.drawable.henderson),
            Players("Конате", R.drawable.vandeik)

        )
        "Arsenal" -> listOf(
            Players("Габриэл Жезус", R.drawable.jesus),
            Players("Томас Парти", R.drawable.parti),
            Players("Николя Пепе", R.drawable.pepe),
            Players("Рис Нелсон", R.drawable.nelson),
            Players("Пьер-Эмерик Обамеянг", R.drawable.jesus),
            Players("Александер Ляказетт", R.drawable.parti),
            Players("Букайо Сака", R.drawable.pepe),
            Players("Киран Тирни", R.drawable.nelson),
            Players("Гранит Жака", R.drawable.jesus),
            Players("Бернд Лено", R.drawable.parti),
            Players("Эмил Смит Роу", R.drawable.pepe),
            Players("Рис Нелсон", R.drawable.nelson)

        )

        "Manchester City" -> listOf(
            Players("Габриэл Жезус", R.drawable.jesus),
            Players("Томас Парти", R.drawable.parti),
            Players("Николя Пепе", R.drawable.pepe),
            Players("Рис Нелсон", R.drawable.nelson),
            Players("Пьер-Эмерик Обамеянг", R.drawable.jesus),
            Players("Александер Ляказетт", R.drawable.parti),
            Players("Букайо Сака", R.drawable.pepe),
            Players("Киран Тирни", R.drawable.nelson),
            Players("Гранит Жака", R.drawable.jesus),
            Players("Бернд Лено", R.drawable.parti),
            Players("Эмил Смит Роу", R.drawable.pepe),
            Players("Рис Нелсон", R.drawable.nelson)

        )
        "Manchester Unt" -> listOf(
            Players("Габриэл Жезус", R.drawable.jesus),
            Players("Томас Парти", R.drawable.parti),
            Players("Николя Пепе", R.drawable.pepe),
            Players("Рис Нелсон", R.drawable.nelson),
            Players("Пьер-Эмерик Обамеянг", R.drawable.jesus),
            Players("Александер Ляказетт", R.drawable.parti),
            Players("Букайо Сака", R.drawable.pepe),
            Players("Киран Тирни", R.drawable.nelson),
            Players("Гранит Жака", R.drawable.jesus),
            Players("Бернд Лено", R.drawable.parti),
            Players("Эмил Смит Роу", R.drawable.pepe),
            Players("Рис Нелсон", R.drawable.nelson)

        )
        "Newcastle" -> listOf(
            Players("Габриэл Жезус", R.drawable.jesus),
            Players("Томас Парти", R.drawable.parti),
            Players("Николя Пепе", R.drawable.pepe),
            Players("Рис Нелсон", R.drawable.nelson),
            Players("Пьер-Эмерик Обамеянг", R.drawable.jesus),
            Players("Александер Ляказетт", R.drawable.parti),
            Players("Букайо Сака", R.drawable.pepe),
            Players("Киран Тирни", R.drawable.nelson),
            Players("Гранит Жака", R.drawable.jesus),
            Players("Бернд Лено", R.drawable.parti),
            Players("Эмил Смит Роу", R.drawable.pepe),
            Players("Рис Нелсон", R.drawable.nelson)

        )
        "Bavaria" -> listOf(
            Players("Садьо Мане", R.drawable.mane),
            Players("Томас Мюллер", R.drawable.muller),
            Players("Матис Тель", R.drawable.tel),
            Players("Райан Гравенберх", R.drawable.raian),
            Players(" Мануэль Нойер", R.drawable.mane),
            Players("Леон Горецка", R.drawable.muller),
            Players("Давид Алаба", R.drawable.tel),
            Players("Никлас Зюле", R.drawable.raian),
            Players("Джером Боатенг", R.drawable.mane),
            Players("Лукас Эрнандес", R.drawable.muller),
            Players("Бенжамен Павар", R.drawable.tel),
            Players("Джейми Лоренцо", R.drawable.raian)


        )
        "Dortmund" -> listOf(
            Players("Thomas Meunier", R.drawable.meunier),
            Players("Mateu Morey Bauzà", R.drawable.bauza),
            Players("Emre Can", R.drawable.can),
            Players("Salih Özcan", R.drawable.salih),
            Players("Mateus Cunha", R.drawable.meunier),
            Players("Dedryck Boyata", R.drawable.bauza),
            Players("Marvin Plattenhardt", R.drawable.can),
            Players("Vladimir Darida", R.drawable.salih),
            Players("Maximilian Mittelstädt", R.drawable.meunier),
            Players("Lucas Tousart", R.drawable.bauza),
            Players("Nils Körber", R.drawable.can),
            Players("Robert Andrich", R.drawable.salih)


        )
        "Gerta" -> listOf(
            Players("Ensar Aksakal", R.drawable.ensar),
            Players("Dodi Lukébakio", R.drawable.dodi),
            Players("Marco Richter", R.drawable.richter),
            Players("Palkó Dárdai", R.drawable.dardai),
            Players("Marco Reus", R.drawable.ensar),
            Players("Jadon Sancho", R.drawable.dodi),
            Players("Mats Hummels", R.drawable.richter),
            Players("Achraf Hakimi", R.drawable.dardai),
            Players("Thorgan Hazard", R.drawable.ensar),
            Players("Julian Brandt", R.drawable.dodi),
            Players("Mario Götze", R.drawable.richter),
            Players("Raphael Guerreiro", R.drawable.dardai)

        )


        "Shalke 04" -> listOf(
            Players("Ensar Aksakal", R.drawable.ensar),
            Players("Dodi Lukébakio", R.drawable.dodi),
            Players("Marco Richter", R.drawable.richter),
            Players("Palkó Dárdai", R.drawable.dardai),
            Players("Marco Reus", R.drawable.ensar),
            Players("Jadon Sancho", R.drawable.dodi),
            Players("Mats Hummels", R.drawable.richter),
            Players("Achraf Hakimi", R.drawable.dardai),
            Players("Thorgan Hazard", R.drawable.ensar),
            Players("Julian Brandt", R.drawable.dodi),
            Players("Mario Götze", R.drawable.richter),
            Players("Raphael Guerreiro", R.drawable.dardai)

        )

        "Leipzig" -> listOf(
            Players("Ensar Aksakal", R.drawable.ensar),
            Players("Dodi Lukébakio", R.drawable.dodi),
            Players("Marco Richter", R.drawable.richter),
            Players("Palkó Dárdai", R.drawable.dardai),
            Players("Marco Reus", R.drawable.ensar),
            Players("Jadon Sancho", R.drawable.dodi),
            Players("Mats Hummels", R.drawable.richter),
            Players("Achraf Hakimi", R.drawable.dardai),
            Players("Thorgan Hazard", R.drawable.ensar),
            Players("Julian Brandt", R.drawable.dodi),
            Players("Mario Götze", R.drawable.richter),
            Players("Raphael Guerreiro", R.drawable.dardai)

        )

        "Stuttgart" -> listOf(
            Players("Ensar Aksakal", R.drawable.ensar),
            Players("Dodi Lukébakio", R.drawable.dodi),
            Players("Marco Richter", R.drawable.richter),
            Players("Palkó Dárdai", R.drawable.dardai),
            Players("Marco Reus", R.drawable.ensar),
            Players("Jadon Sancho", R.drawable.dodi),
            Players("Mats Hummels", R.drawable.richter),
            Players("Achraf Hakimi", R.drawable.dardai),
            Players("Thorgan Hazard", R.drawable.ensar),
            Players("Julian Brandt", R.drawable.dodi),
            Players("Mario Götze", R.drawable.richter),
            Players("Raphael Guerreiro", R.drawable.dardai)

        )

        "RealMadrid" -> listOf(
            Players("Lucas Vázquez", R.drawable.vaskez),
            Players("Álvaro Odriozola", R.drawable.oriadzolo),
            Players("Aurélien Tchouaméni", R.drawable.aurelien),
            Players("Jude Bellingham", R.drawable.bellingham),
            Players("Vinícius Júnior", R.drawable.vaskez),
            Players("Rodrygo", R.drawable.oriadzolo),
            Players("Militão", R.drawable.aurelien),
            Players("Díaz", R.drawable.bellingham),
            Players("Valverde", R.drawable.vaskez),
            Players("Ødegaard", R.drawable.oriadzolo),
            Players("Lunin", R.drawable.aurelien),
            Players("Gutiérrez", R.drawable.bellingham)

        )
        "Barselona" -> listOf(
            Players("Марк-Андре тер Стеген", R.drawable.terstegen),
            Players("Усман Дембеле", R.drawable.dembele),
            Players("Ферран Торрес", R.drawable.torres),
            Players("Роберт Левандовски", R.drawable.lewandovski),
            Players("Griezmann", R.drawable.terstegen),
            Players("Piqué", R.drawable.dembele),
            Players("Sergio Busquets", R.drawable.torres),
            Players("Jordi Alba", R.drawable.lewandovski),
            Players("Frenkie de Jong", R.drawable.terstegen),
            Players("Samuel Umtiti", R.drawable.dembele),
            Players("Vidal", R.drawable.torres),
            Players("Ivan Rakitić", R.drawable.lewandovski)

        )
        "Villareal" -> listOf(
            Players("Франсис Коклен", R.drawable.koklen),
            Players("Этьен Капу", R.drawable.kapu),
            Players("Александр Серлот", R.drawable.serlot),
            Players("Жерар Морено", R.drawable.moreno),
            Players("Javi Fuego", R.drawable.koklen),
            Players("Sergio Asenjo", R.drawable.kapu),
            Players("Raúl Albiol", R.drawable.serlot),
            Players("Pau Torres", R.drawable.moreno),
            Players("Mario Gaspar", R.drawable.koklen),
            Players("Moisés Gómez", R.drawable.kapu),
            Players("Samu Castillejo", R.drawable.serlot),
            Players("Dani Parejo", R.drawable.moreno)

        )

        "Sevilla" -> listOf(
            Players("Франсис Коклен", R.drawable.koklen),
            Players("Этьен Капу", R.drawable.kapu),
            Players("Александр Серлот", R.drawable.serlot),
            Players("Жерар Морено", R.drawable.moreno),
            Players("Javi Fuego", R.drawable.koklen),
            Players("Sergio Asenjo", R.drawable.kapu),
            Players("Raúl Albiol", R.drawable.serlot),
            Players("Pau Torres", R.drawable.moreno),
            Players("Mario Gaspar", R.drawable.koklen),
            Players("Moisés Gómez", R.drawable.kapu),
            Players("Samu Castillejo", R.drawable.serlot),
            Players("Dani Parejo", R.drawable.moreno)

        )

        "Betis" -> listOf(
            Players("Франсис Коклен", R.drawable.koklen),
            Players("Этьен Капу", R.drawable.kapu),
            Players("Александр Серлот", R.drawable.serlot),
            Players("Жерар Морено", R.drawable.moreno),
            Players("Javi Fuego", R.drawable.koklen),
            Players("Sergio Asenjo", R.drawable.kapu),
            Players("Raúl Albiol", R.drawable.serlot),
            Players("Pau Torres", R.drawable.moreno),
            Players("Mario Gaspar", R.drawable.koklen),
            Players("Moisés Gómez", R.drawable.kapu),
            Players("Samu Castillejo", R.drawable.serlot),
            Players("Dani Parejo", R.drawable.moreno)

        )

        "Athletic Bilbao" -> listOf(
            Players("Франсис Коклен", R.drawable.koklen),
            Players("Этьен Капу", R.drawable.kapu),
            Players("Александр Серлот", R.drawable.serlot),
            Players("Жерар Морено", R.drawable.moreno),
            Players("Javi Fuego", R.drawable.koklen),
            Players("Sergio Asenjo", R.drawable.kapu),
            Players("Raúl Albiol", R.drawable.serlot),
            Players("Pau Torres", R.drawable.moreno),
            Players("Mario Gaspar", R.drawable.koklen),
            Players("Moisés Gómez", R.drawable.kapu),
            Players("Samu Castillejo", R.drawable.serlot),
            Players("Dani Parejo", R.drawable.moreno)

        )

        "PSG" -> listOf(
            Players("Кепа Аррисабалага", R.drawable.kepa),
            Players("Маркус Беттинелли", R.drawable.img),
            Players("Михаил Мудрик", R.drawable.mudrik),
            Players("Тиаго Силва", R.drawable.nkuku),
            Players("Курт Зума", R.drawable.kepa),
            Players("Мэйсон Маунт", R.drawable.img),
            Players("Кай Хаверц", R.drawable.mudrik),
            Players("Кристиан Пулишич", R.drawable.nkuku),
            Players("Тимо Вернер", R.drawable.kepa),
            Players("Ромеру Лукаку", R.drawable.img),
            Players("Эдуард Менди", R.drawable.mudrik),
            Players("Кристофер Нкунку", R.drawable.nkuku)

        )
        "Monako" -> listOf(
            Players("Салах", R.drawable.salah),
            Players("Алиссон", R.drawable.alisson),
            Players("Хендерсон", R.drawable.henderson),
            Players("Ван дейк", R.drawable.vandeik),
            Players("Фабиньо", R.drawable.salah),
            Players("Фирмино", R.drawable.alisson),
            Players("Тиаго Алькантара", R.drawable.henderson),
            Players("Джото", R.drawable.vandeik),
            Players("Алекс Окслейд-Чемберлен", R.drawable.salah),
            Players("Джеймс Милнер", R.drawable.alisson),
            Players("Анди Робертсон", R.drawable.henderson),
            Players("Конате", R.drawable.vandeik)

        )
        "Lion" -> listOf(
            Players("Габриэл Жезус", R.drawable.jesus),
            Players("Томас Парти", R.drawable.parti),
            Players("Николя Пепе", R.drawable.pepe),
            Players("Рис Нелсон", R.drawable.nelson),
            Players("Пьер-Эмерик Обамеянг", R.drawable.jesus),
            Players("Александер Ляказетт", R.drawable.parti),
            Players("Букайо Сака", R.drawable.pepe),
            Players("Киран Тирни", R.drawable.nelson),
            Players("Гранит Жака", R.drawable.jesus),
            Players("Бернд Лено", R.drawable.parti),
            Players("Эмил Смит Роу", R.drawable.pepe),
            Players("Рис Нелсон", R.drawable.nelson)

        )

        "Lille" -> listOf(
            Players("Габриэл Жезус", R.drawable.jesus),
            Players("Томас Парти", R.drawable.parti),
            Players("Николя Пепе", R.drawable.pepe),
            Players("Рис Нелсон", R.drawable.nelson),
            Players("Пьер-Эмерик Обамеянг", R.drawable.jesus),
            Players("Александер Ляказетт", R.drawable.parti),
            Players("Букайо Сака", R.drawable.pepe),
            Players("Киран Тирни", R.drawable.nelson),
            Players("Гранит Жака", R.drawable.jesus),
            Players("Бернд Лено", R.drawable.parti),
            Players("Эмил Смит Роу", R.drawable.pepe),
            Players("Рис Нелсон", R.drawable.nelson)

        )

        "Nantes" -> listOf(
            Players("Габриэл Жезус", R.drawable.jesus),
            Players("Томас Парти", R.drawable.parti),
            Players("Николя Пепе", R.drawable.pepe),
            Players("Рис Нелсон", R.drawable.nelson),
            Players("Пьер-Эмерик Обамеянг", R.drawable.jesus),
            Players("Александер Ляказетт", R.drawable.parti),
            Players("Букайо Сака", R.drawable.pepe),
            Players("Киран Тирни", R.drawable.nelson),
            Players("Гранит Жака", R.drawable.jesus),
            Players("Бернд Лено", R.drawable.parti),
            Players("Эмил Смит Роу", R.drawable.pepe),
            Players("Рис Нелсон", R.drawable.nelson)

        )

        "Marseille" -> listOf(
            Players("Габриэл Жезус", R.drawable.jesus),
            Players("Томас Парти", R.drawable.parti),
            Players("Николя Пепе", R.drawable.pepe),
            Players("Рис Нелсон", R.drawable.nelson),
            Players("Пьер-Эмерик Обамеянг", R.drawable.jesus),
            Players("Александер Ляказетт", R.drawable.parti),
            Players("Букайо Сака", R.drawable.pepe),
            Players("Киран Тирни", R.drawable.nelson),
            Players("Гранит Жака", R.drawable.jesus),
            Players("Бернд Лено", R.drawable.parti),
            Players("Эмил Смит Роу", R.drawable.pepe),
            Players("Рис Нелсон", R.drawable.nelson)

        )

        "Spartak" -> listOf(
            Players("Садьо Мане", R.drawable.mane),
            Players("Томас Мюллер", R.drawable.muller),
            Players("Матис Тель", R.drawable.tel),
            Players("Райан Гравенберх", R.drawable.raian),
            Players(" Мануэль Нойер", R.drawable.mane),
            Players("Леон Горецка", R.drawable.muller),
            Players("Давид Алаба", R.drawable.tel),
            Players("Никлас Зюле", R.drawable.raian),
            Players("Джером Боатенг", R.drawable.mane),
            Players("Лукас Эрнандес", R.drawable.muller),
            Players("Бенжамен Павар", R.drawable.tel),
            Players("Джейми Лоренцо", R.drawable.raian)
        )

        "Zenit" -> listOf(
            Players("Садьо Мане", R.drawable.mane),
            Players("Томас Мюллер", R.drawable.muller),
            Players("Матис Тель", R.drawable.tel),
            Players("Райан Гравенберх", R.drawable.raian),
            Players(" Мануэль Нойер", R.drawable.mane),
            Players("Леон Горецка", R.drawable.muller),
            Players("Давид Алаба", R.drawable.tel),
            Players("Никлас Зюле", R.drawable.raian),
            Players("Джером Боатенг", R.drawable.mane),
            Players("Лукас Эрнандес", R.drawable.muller),
            Players("Бенжамен Павар", R.drawable.tel),
            Players("Джейми Лоренцо", R.drawable.raian)
        )

        "Rostov" -> listOf(
            Players("Садьо Мане", R.drawable.mane),
            Players("Томас Мюллер", R.drawable.muller),
            Players("Матис Тель", R.drawable.tel),
            Players("Райан Гравенберх", R.drawable.raian),
            Players(" Мануэль Нойер", R.drawable.mane),
            Players("Леон Горецка", R.drawable.muller),
            Players("Давид Алаба", R.drawable.tel),
            Players("Никлас Зюле", R.drawable.raian),
            Players("Джером Боатенг", R.drawable.mane),
            Players("Лукас Эрнандес", R.drawable.muller),
            Players("Бенжамен Павар", R.drawable.tel),
            Players("Джейми Лоренцо", R.drawable.raian)
        )

        "Sochi" -> listOf(
            Players("Садьо Мане", R.drawable.mane),
            Players("Томас Мюллер", R.drawable.muller),
            Players("Матис Тель", R.drawable.tel),
            Players("Райан Гравенберх", R.drawable.raian),
            Players(" Мануэль Нойер", R.drawable.mane),
            Players("Леон Горецка", R.drawable.muller),
            Players("Давид Алаба", R.drawable.tel),
            Players("Никлас Зюле", R.drawable.raian),
            Players("Джером Боатенг", R.drawable.mane),
            Players("Лукас Эрнандес", R.drawable.muller),
            Players("Бенжамен Павар", R.drawable.tel),
            Players("Джейми Лоренцо", R.drawable.raian)
        )


        "Lokomotiv" -> listOf(
            Players("Thomas Meunier", R.drawable.meunier),
            Players("Mateu Morey Bauzà", R.drawable.bauza),
            Players("Emre Can", R.drawable.can),
            Players("Salih Özcan", R.drawable.salih),
            Players("Mateus Cunha", R.drawable.meunier),
            Players("Dedryck Boyata", R.drawable.bauza),
            Players("Marvin Plattenhardt", R.drawable.can),
            Players("Vladimir Darida", R.drawable.salih),
            Players("Maximilian Mittelstädt", R.drawable.meunier),
            Players("Lucas Tousart", R.drawable.bauza),
            Players("Nils Körber", R.drawable.can),
            Players("Robert Andrich", R.drawable.salih)


        )
        "Krasnodar" -> listOf(
            Players("Ensar Aksakal", R.drawable.ensar),
            Players("Dodi Lukébakio", R.drawable.dodi),
            Players("Marco Richter", R.drawable.richter),
            Players("Palkó Dárdai", R.drawable.dardai),
            Players("Marco Reus", R.drawable.ensar),
            Players("Jadon Sancho", R.drawable.dodi),
            Players("Mats Hummels", R.drawable.richter),
            Players("Achraf Hakimi", R.drawable.dardai),
            Players("Thorgan Hazard", R.drawable.ensar),
            Players("Julian Brandt", R.drawable.dodi),
            Players("Mario Götze", R.drawable.richter),
            Players("Raphael Guerreiro", R.drawable.dardai)

        )
        "Inter" -> listOf(
            Players("Lucas Vázquez", R.drawable.vaskez),
            Players("Álvaro Odriozola", R.drawable.oriadzolo),
            Players("Aurélien Tchouaméni", R.drawable.aurelien),
            Players("Jude Bellingham", R.drawable.bellingham),
            Players("Vinícius Júnior", R.drawable.vaskez),
            Players("Rodrygo", R.drawable.oriadzolo),
            Players("Militão", R.drawable.aurelien),
            Players("Díaz", R.drawable.bellingham),
            Players("Valverde", R.drawable.vaskez),
            Players("Ødegaard", R.drawable.oriadzolo),
            Players("Lunin", R.drawable.aurelien),
            Players("Gutiérrez", R.drawable.bellingham)

        )
        "Juventus" -> listOf(
            Players("Марк-Андре тер Стеген", R.drawable.terstegen),
            Players("Усман Дембеле", R.drawable.dembele),
            Players("Ферран Торрес", R.drawable.torres),
            Players("Роберт Левандовски", R.drawable.lewandovski),
            Players("Griezmann", R.drawable.terstegen),
            Players("Piqué", R.drawable.dembele),
            Players("Sergio Busquets", R.drawable.torres),
            Players("Jordi Alba", R.drawable.lewandovski),
            Players("Frenkie de Jong", R.drawable.terstegen),
            Players("Samuel Umtiti", R.drawable.dembele),
            Players("Vidal", R.drawable.torres),
            Players("Ivan Rakitić", R.drawable.lewandovski)

        )
        "Roma" -> listOf(
            Players("Франсис Коклен", R.drawable.koklen),
            Players("Этьен Капу", R.drawable.kapu),
            Players("Александр Серлот", R.drawable.serlot),
            Players("Жерар Морено", R.drawable.moreno),
            Players("Javi Fuego", R.drawable.koklen),
            Players("Sergio Asenjo", R.drawable.kapu),
            Players("Raúl Albiol", R.drawable.serlot),
            Players("Pau Torres", R.drawable.moreno),
            Players("Mario Gaspar", R.drawable.koklen),
            Players("Moisés Gómez", R.drawable.kapu),
            Players("Samu Castillejo", R.drawable.serlot),
            Players("Dani Parejo", R.drawable.moreno)

        )

        "Napoli" -> listOf(
            Players("Франсис Коклен", R.drawable.koklen),
            Players("Этьен Капу", R.drawable.kapu),
            Players("Александр Серлот", R.drawable.serlot),
            Players("Жерар Морено", R.drawable.moreno),
            Players("Javi Fuego", R.drawable.koklen),
            Players("Sergio Asenjo", R.drawable.kapu),
            Players("Raúl Albiol", R.drawable.serlot),
            Players("Pau Torres", R.drawable.moreno),
            Players("Mario Gaspar", R.drawable.koklen),
            Players("Moisés Gómez", R.drawable.kapu),
            Players("Samu Castillejo", R.drawable.serlot),
            Players("Dani Parejo", R.drawable.moreno)

        )

        "Lazio" -> listOf(
            Players("Франсис Коклен", R.drawable.koklen),
            Players("Этьен Капу", R.drawable.kapu),
            Players("Александр Серлот", R.drawable.serlot),
            Players("Жерар Морено", R.drawable.moreno),
            Players("Javi Fuego", R.drawable.koklen),
            Players("Sergio Asenjo", R.drawable.kapu),
            Players("Raúl Albiol", R.drawable.serlot),
            Players("Pau Torres", R.drawable.moreno),
            Players("Mario Gaspar", R.drawable.koklen),
            Players("Moisés Gómez", R.drawable.kapu),
            Players("Samu Castillejo", R.drawable.serlot),
            Players("Dani Parejo", R.drawable.moreno)

        )

        "Atalanta" -> listOf(
            Players("Франсис Коклен", R.drawable.koklen),
            Players("Этьен Капу", R.drawable.kapu),
            Players("Александр Серлот", R.drawable.serlot),
            Players("Жерар Морено", R.drawable.moreno),
            Players("Javi Fuego", R.drawable.koklen),
            Players("Sergio Asenjo", R.drawable.kapu),
            Players("Raúl Albiol", R.drawable.serlot),
            Players("Pau Torres", R.drawable.moreno),
            Players("Mario Gaspar", R.drawable.koklen),
            Players("Moisés Gómez", R.drawable.kapu),
            Players("Samu Castillejo", R.drawable.serlot),
            Players("Dani Parejo", R.drawable.moreno)

        )




        else -> emptyList()
    }
}