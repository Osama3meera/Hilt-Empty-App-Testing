package com.example.hilt.repo

import com.example.hilt.model.TeamModel

class TeamRepoImpl : TeamRepo {
    override fun getTeam() = listOf(
        TeamModel(
            "https://upload.wikimedia.org/wikipedia/en/thumb/c/cc/Chelsea_FC.svg/800px-Chelsea_FC.svg.png",
            "Chelsea Football Club",
            ""
        ),
        TeamModel(
            "https://upload.wikimedia.org/wikipedia/commons/thumb/6/6c/Todd_Boehly_Official_Headshot.jpg/220px-Todd_Boehly_Official_Headshot.jpg",
            "Tod Boehly",
            "Owner"
        ),
        TeamModel(
            "https://upload.wikimedia.org/wikipedia/commons/thumb/8/8e/2021_FIFA_Club_World_Cup_Final_-_30.jpg/220px-2021_FIFA_Club_World_Cup_Final_-_30.jpg",
            "Édouard Osoque Mendy",
            "Goal Keeper 16"
        ),
        TeamModel(
            "https://upload.wikimedia.org/wikipedia/commons/thumb/3/3e/20180602_FIFA_Friendly_Match_Austria_vs._Germany_Antonio_R%C3%BCdiger_850_0711.jpg/220px-20180602_FIFA_Friendly_Match_Austria_vs._Germany_Antonio_R%C3%BCdiger_850_0711.jpg",
            "Antonio Rüdiger",
            "Center-back 2"
        ),
        TeamModel(
            "https://upload.wikimedia.org/wikipedia/commons/thumb/c/c8/20180610_FIFA_Friendly_Match_Austria_vs._Brazil_Thiago_Silva_850_1582.jpg/220px-20180610_FIFA_Friendly_Match_Austria_vs._Brazil_Thiago_Silva_850_1582.jpg",
            "Thiago Emiliano da Silva",
            "Centre-back 6"
        ),
        TeamModel(
            "https://upload.wikimedia.org/wikipedia/commons/thumb/7/7f/C%C3%A9sar_Azpilicueta%2C_Al_Hilal_SFC_vs_Chelsea_F.C.%2C_9_February_2022.jpg/220px-C%C3%A9sar_Azpilicueta%2C_Al_Hilal_SFC_vs_Chelsea_F.C.%2C_9_February_2022.jpg",
            "César Azpilicueta",
            "Right-back-centre-back 28"
        ),
        TeamModel(
            "https://upload.wikimedia.org/wikipedia/commons/thumb/1/1a/Ben_Chilwell_2020.jpg/220px-Ben_Chilwell_2020.jpg",
            "Benjamin James Chilwell",
            "Left-back 21"
        ),
        TeamModel(
            "https://upload.wikimedia.org/wikipedia/commons/thumb/8/89/Reece_James_2021.jpg/220px-Reece_James_2021.jpg",
            "Reece James",
            "Right-back 24"
        ),
        TeamModel(
            "https://upload.wikimedia.org/wikipedia/commons/thumb/d/d9/Chelsea_vs._Arsenal%2C_29_May_2019_18_Kovacic.jpg/220px-Chelsea_vs._Arsenal%2C_29_May_2019_18_Kovacic.jpg",
            "Mateo Kovačić",
            "Midfielder 8"
        ),
        TeamModel(
            "https://upload.wikimedia.org/wikipedia/commons/c/c8/N%27Golo_Kant%C3%A9_%28cropped_2%29.jpg",
            "Ngolo Kante",
            "Central midfielder 7"
        ),
        TeamModel(
            "https://upload.wikimedia.org/wikipedia/commons/thumb/e/e1/Hakim_Ziyech_2021.jpg/220px-Hakim_Ziyech_2021.jpg",
            "Hakim Ziyech",
            "Attacking midfielder, winger 22"
        ),
        TeamModel(
            "https://upload.wikimedia.org/wikipedia/commons/thumb/3/32/Mountbrightonoct3_2019_%28cropped%29.jpg/220px-Mountbrightonoct3_2019_%28cropped%29.jpg",
            "Mason Mount",
            "Attacking midfielder-central midfielder 19"
        ),
        TeamModel(
            "https://upload.wikimedia.org/wikipedia/commons/thumb/e/e8/2019-06-11_Fu%C3%9Fball%2C_M%C3%A4nner%2C_L%C3%A4nderspiel%2C_Deutschland-Estland_StP_2059_LR10_by_Stepro.jpg/220px-2019-06-11_Fu%C3%9Fball%2C_M%C3%A4nner%2C_L%C3%A4nderspiel%2C_Deutschland-Estland_StP_2059_LR10_by_Stepro.jpg",
            "Kai Havertz",
            "Attacking midfielder 29"
        )
    )
}