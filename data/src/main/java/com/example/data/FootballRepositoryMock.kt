package com.example.data

import com.example.domain.model.*
import com.example.domain.repository.FootballRepository

class FootballRepositoryMock : FootballRepository {

    override fun getCountry(): List<CountryModel> = listOf(
        CountryModel("England", "Премьер Лига", "1", R.drawable.apl),
        CountryModel("Germany", "Бундес Лига", "2", R.drawable.bundes),
        CountryModel("Spain", "Ла Лига", "3", R.drawable.laliga))

    override fun getClubsForCountry(country: String): List<ClubName> = when (country) {
        "England" -> listOf(ClubName("Chelsea", R.drawable.chelsea), ClubName("Liverpool", R.drawable.liverpool), ClubName("Arsenal", R.drawable.arsenal))
        "Germany" -> listOf(ClubName("Bavaria", R.drawable.bavaria), ClubName("Gerta", R.drawable.gerta), ClubName("Dortmund", R.drawable.borussia))
        "Spain" -> listOf(ClubName("RealMadrid", R.drawable.real), ClubName("Barselona", R.drawable.barsa), ClubName("Villareal", R.drawable.villareal))
        else -> emptyList()
    }

    override fun getClubs(club: String): List<ClubDetailModel> = when (club) {
        "Chelsea" -> listOf(
            ClubDetailModel("Chelsea", R.drawable.chelsea, "England", "Stamford Bridge",  R.drawable.chelseastadium,"4"))
        "Liverpool" -> listOf(
            ClubDetailModel("Liverpool", R.drawable.liverpool, "England", "Anfield Road", R.drawable.liverpoolstadium,"4"))
        "Arsenal" -> listOf(
            ClubDetailModel("Arsenal", R.drawable.arsenal, "England", "Emirates Stadium", R.drawable.arsenalstadium,"4"))
        "Bavaria" -> listOf(
            ClubDetailModel("Bavaria", R.drawable.bavaria, "Germany", "Allianz Arena", R.drawable.bavariastadium,"4"))
        "Dortmund" -> listOf(
            ClubDetailModel("Dortmund", R.drawable.borussia, "Germany", "SIGNAL IDUNA PARK", R.drawable.burussiastadium,"4"))
        "Gerta" -> listOf(
            ClubDetailModel("Gerta", R.drawable.gerta, "Germany", "Olympiastadion Berlin", R.drawable.gertastadium, "4"))
        "RealMadrid" -> listOf(
            ClubDetailModel("RealMadrid", R.drawable.real, "Spain", "Santiago Bernabéu Stadium", R.drawable.realsradium,"4"))
        "Barselona" -> listOf(
            ClubDetailModel("Barselona", R.drawable.barsa, "Spain", "Camp Nou", R.drawable.campnou,"4"))
        "Villareal" -> listOf(
            ClubDetailModel("Villareal",R.drawable.villareal , "Spain", "La Ceramica", R.drawable.villarealstadium, "4"))
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
        else -> emptyList()
    }

    override fun getPlayers(name: String): List<Players> = when (name) {
        "Chelsea" -> listOf(
            Players("Кепа Аррисабалага", R.drawable.kepa),
            Players("Маркус Беттинелли", R.drawable.img),
            Players("Михаил Мудрик", R.drawable.mudrik),
            Players("Кристофер Нкунку", R.drawable.nkuku)
        )
        "Liverpool" -> listOf(
            Players("Салах", R.drawable.salah),
            Players("Алиссон", R.drawable.alisson),
            Players("Хендерсон", R.drawable.henderson),
            Players("Ван дейк", R.drawable.vandeik)
        )
        "Arsenal" -> listOf(
            Players("Габриэл Жезус", R.drawable.jesus),
            Players("Томас Парти", R.drawable.parti),
            Players("Николя Пепе", R.drawable.pepe),
            Players("Рис Нелсон", R.drawable.nelson)
        )
        "Bavaria" -> listOf(
            Players("Садьо Мане", R.drawable.mane),
            Players("Томас Мюллер", R.drawable.muller),
            Players("Матис Тель", R.drawable.tel),
            Players("Райан Гравенберх", R.drawable.raian)
        )
        "Dortmund" -> listOf(
            Players("Thomas Meunier", R.drawable.meunier),
            Players("Mateu Morey Bauzà", R.drawable.bauza),
            Players("Emre Can", R.drawable.can),
            Players("Salih Özcan", R.drawable.salih)
        )
        "Gerta" -> listOf(
            Players("Ensar Aksakal", R.drawable.ensar),
            Players("Dodi Lukébakio", R.drawable.dodi),
            Players("Marco Richter", R.drawable.richter),
            Players("Palkó Dárdai", R.drawable.dardai)
        )
        "RealMadrid" -> listOf(
            Players("Lucas Vázquez", R.drawable.vaskez),
            Players("Álvaro Odriozola", R.drawable.oriadzolo),
            Players("Aurélien Tchouaméni", R.drawable.aurelien),
            Players("Jude Bellingham", R.drawable.bellingham)
        )
        "Barselona" -> listOf(
            Players("Марк-Андре тер Стеген", R.drawable.terstegen),
            Players("Усман Дембеле", R.drawable.dembele),
            Players("Ферран Торрес", R.drawable.torres),
            Players("Роберт Левандовски", R.drawable.lewandovski)
        )
        "Villareal" -> listOf(
            Players("Франсис Коклен", R.drawable.koklen),
            Players("Этьен Капу", R.drawable.kapu),
            Players("Александр Серлот", R.drawable.serlot),
            Players("Жерар Морено", R.drawable.moreno)
        )
        else -> emptyList()
    }
}