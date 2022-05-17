package com.demo.android.quiz.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock.EXTRA_MESSAGE
import android.util.Log
import com.demo.android.quiz.R
import kotlinx.android.synthetic.main.activity_result_analysis.*

class ResultAnalysisActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result_analysis)

        val ans = intent.getSerializableExtra(EXTRA_MESSAGE) as ArrayList<String>
        Log.i("all ans:", ans.toString())

        var results: ArrayList<String> = arrayListOf()

        results.add(0, "Choose the Correct option related to Android. \nCorrect answer: Android is an Operating System")

        results.add(1,"What is an activity in android? \nCorrect answer: A activity is a single screen in an application.")

        results.add(2,"The full form of ADB is. \nCorrect answer:  Android Debug Bridge")

        results.add(3, "Among the following options choose the one for which Android is based on Linux. "+
                "\nCorrect answer:  All of the above are reasons for which Android is based on Linux.")

        results.add(4, "Among the below virtual machines choose the one which is used by the Android operating system \n" +
                "\nCorrect answer:  Android uses Dalvik operating system.")

        results.add(5, "Identify the language on which Android is based upon." +
                "\nCorrect answer: Android is based upon Java.")

        results.add(6, "All layout classes are the subclasses of" +
                "\nCorrect answer: all layout classes are the subclasses of android.view.ViewGroup in android.")

        results.add(7, "The full form of APK is" +
                "\nCorrect answer: APK stands for Android package kit.")

        results.add(8, "What is manifest XML in android?" +
                "\nCorrect answer: It has all the information about an application")

        results.add(9, "What is the use of a content provider in Android?" +
                "\nCorrect answer: A content provider is used to share information between Android applications.")

        results.add(10, "While developing android application developers can test their apps on " +
                "\nCorrect answer: Apps can be tested in all the sources mentioned above.")

        results.add(11, "In android, mini activities are also known as" +
                "\nCorrect answer: In android, mini activities are also known as Fragments")

        results.add(12, "Among the following choose the one which converts Java bytecode into Dalvik bytecode" +
                "\nCorrect answer:  dex compiler converts convert JAVA bytecode into Dalvik bytecode.")

        results.add(13, "The services in android can be stopped using which of the following method?" +
                "\nCorrect answer: stopSelf() and stopService() method can be used to stop services in android.")

        results.add(14, "Activity in Android can be killed using?" +
                "\nCorrect answer: Activity in Android can be killed using both finishActivity (int requestCode) and finish() method.")

        var i = 1;
        for (res in results) {
            textView4.append(
                i.toString() +
                        ". " +
                        res.toString() +
                        "\nYour answer: " + ans.get(i-1) +
                        "\n\n"
            )
            i++
        }


    }
}