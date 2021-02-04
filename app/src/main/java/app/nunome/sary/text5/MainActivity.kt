package app.nunome.sary.text5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    val people = arrayOf<String>("ルフィ","ゾロ","ナミ","ウソップ")
    val food = arrayOf<String>("カレー","味噌汁","チャーハン","エビチリ", "白米")
    val sele = arrayOf<String>("よそえました^^", "よそえませんでした!")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun serveFood(view: View?) {
        val randomName = Random
        val index = randomName.nextInt(4)
        val name = people[index]
        nameTextView.text = name + "に"

        foodTextView.text = food[Random.nextInt(5)] + "を"

        val selecttext = Random
        var index2 = selecttext.nextInt(2)
        val selText = sele[index2]
        verbTextView.text = selText

        if (index2 == 1) {
            verbTextView.setTextSize(30.0f)
        } else {
            verbTextView.setTextSize(20.0f)
        }

        /*
        if (Random.nextInt(100) < 50) {
            verbTextView.text = "よそえました^^"
        } else {
            verbTextView.text = "よそえませんでした"
        }

         */

    }
}