package com.example.electronbook

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    private lateinit var Book: TextView
    private lateinit var ButtonBTN: Button
    private lateinit var Booktext: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        Book = findViewById(R.id.Book)
        ButtonBTN = findViewById(R.id.ButtonBTN)
        Booktext = findViewById(R.id.Booktext)
        ButtonBTN.setOnClickListener{

            fun loadBook(text: String): List<String> {
                return text.split(" ")
            }
            val bookText = loadBook(Database.text).joinToString(" ")
            Booktext.text = bookText

        }
    }

}

object Database {
    val text: String = """
        Лев и собачка.
         
        В Лондоне показывали диких зверей и за смотренье брали деньгами или собаками и кошками на корм диким зверям.

        Сказка Лев и собачка, Толстой Лев

        Одному человеку захотелось поглядеть зверей: он ухватил на улице собачонку и принёс её в зверинец. Его пустили смотреть, а собачонку взяли и бросили в клетку ко льву на съеденье.

        Собачка поджала хвост и прижалась в угол клетки. Лев подошёл к ней и понюхал её.

        Собачка легла на спину, подняла лапки и стала махать хвостиком.

        Лев тронул её лапой и перевернул.

        Собачка вскочила и стала перед львом на задние лапки.

        Лев смотрел на собачку, поворачивал голову со стороны на сторону и не трогал её.

        Когда хозяин бросил льву мяса, лев оторвал кусок и оставил собачке.

        Вечером, когда лев лёг спать, собачка легла подле него и положила свою голову ему на лапу.

        Сказка Лев и собачка, Толстой Лев

        С тех пор собачка жила в одной клетке со львом, лев не трогал её, ел корм, спал с ней вместе, а иногда играл с ней.

        Один раз барин пришёл в зверинец и узнал свою собачку; он сказал, что собачка его собственная, и попросил хозяина зверинца отдать ему. Хозяин хотел отдать, но, как только стали звать собачку, чтобы взять её из клетки, лев ощетинился и зарычал.

        Так прожили лев и собачка целый год в одной клетке.

        Через год собачка заболела и издохла. Лев перестал есть, а всё нюхал, лизал собачку и трогал её лапой.

        Когда он понял, что она умерла, он вдруг вспрыгнул, ощетинился, стал хлестать себя хвостом по бокам, бросился на стену клетки и стал грызть засовы и пол.

        Целый день он бился, метался в клетке и ревел, потом лёг подле мёртвой собачки и затих. Хозяин хотел унести мёртвую собачку, но лев никого не подпускал к ней.

        Хозяин думал, что лев забудет своё горе, если ему дать другую собачку, и пустил к нему в клетку живую собачку; но лев тотчас разорвал её на куски. Потом он обнял своими лапами мёртвую собачку и так лежал пять дней.

        На шестой день лев умер.
    """.trimIndent()
}