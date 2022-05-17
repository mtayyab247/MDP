package com.demo.android.quiz.data

import com.demo.android.quiz.data.model.Answer
import com.demo.android.quiz.data.model.Question

class QuestionInfoProvider {

    var questionList = initQuestionList()
    var answerList = initAnswersList()

    private fun initQuestionList(): MutableList<Question>{
        val questions = mutableListOf<Question>()
        questions.add(
            Question(1, "1. Choose the correct option related to Android.")
        )
        questions.add(
            Question(2, "2. What is an activity in android?")
        )
        questions.add(
            Question(3, "3. The full form of ADB is.")
        )
        questions.add(
            Question(4, "4. Among the following options choose the one for which Android is based on Linux.")
        )
        questions.add(
            Question(5, "5. Among the below virtual machines choose the one which is used by the Android operating system")
        )
        questions.add(
            Question(6, "6. Identify the language on which Android is based upon.")
        )
        questions.add(
            Question(7, "7. All layout classes are the subclasses of")
        )
        questions.add(
            Question(8, "8. The full form of APK is")
        )
        questions.add(
            Question(9, "9. What is manifest XML in android?")
        )
        questions.add(
            Question(10, "10. What is the use of a content provider in Android?")
        )
        questions.add(
            Question(11, "11. While developing android application developers can test their apps on")
        )
        questions.add(
            Question(12, "12. In android, mini activities are also known as")
        )
        questions.add(
            Question(13, "13. Among the following choose the one which converts Java bytecode into Dalvik bytecode")
        )
        questions.add(
            Question(14, "14. The services in android can be stopped using which of the following method?")
        )
        questions.add(
            Question(15, "15. Activity in Android can be killed using?")
        )
        return questions
    }

    private fun initAnswersList(): MutableList<Answer>{
        val answers = mutableListOf<Answer>()

        answers.add(Answer(1, 1, false, "Android is a web browser"))
        answers.add(Answer(2, 1, true, "Android is an Operating System"))
        answers.add(Answer(3, 1, false, "Android is a web server"))
        answers.add(Answer(4, 1, false, "None"))

        answers.add(Answer(5, 2, false, "android class"))
        answers.add(Answer(6, 2, false, "android package"))
        answers.add(Answer(7, 2, true, "A single screen in an application with supporting java code"))
        answers.add(Answer(8, 2, false, "None"))

        answers.add(Answer(9, 3, false, "Android Delete Bridge"))
        answers.add(Answer(10, 3, true, "Android Debug Bridge"))
        answers.add(Answer(11, 3, false, "Android Destroy Bridge"))
        answers.add(Answer(12, 3, false, "Android Developed Bridge"))

        answers.add(Answer(13, 4, false, "Networking"))
        answers.add(Answer(14, 4, false, "Portability"))
        answers.add(Answer(15, 4, false, "Security"))
        answers.add(Answer(16, 4, true, "All"))

        answers.add(Answer(17, 5, true, "Dalvik operating system"))
        answers.add(Answer(18, 5, false, "JVM"))
        answers.add(Answer(19, 5, false, "Simple virtual machine"))
        answers.add(Answer(20, 5, false, "None"))

        answers.add(Answer(21, 6, false, "Python"))
        answers.add(Answer(22, 6,false, "C++"))
        answers.add(Answer(23, 6, true, "Java"))
        answers.add(Answer(24, 6, false, "None"))

        answers.add(Answer(25, 7, false, "android.widget"))
        answers.add(Answer(26, 7, false, "android.view.View"))
        answers.add(Answer(27, 7, true, "android.view.ViewGroup"))
        answers.add(Answer(28, 7, false, "None"))

        answers.add(Answer(29, 8, false, "Android Page Kit"))
        answers.add(Answer(30, 8, false, "Android Phone Kit"))
        answers.add(Answer(31, 8, true, "Android Package Kit"))
        answers.add(Answer(32, 8, false, "Android Photo Kit"))

        answers.add(Answer(33, 9, false, "It has information about layout in an application"))
        answers.add(Answer(34, 9, true, " It has all the information about an application"))
        answers.add(Answer(35, 9, false, "It has the information about activities in an application"))
        answers.add(Answer(36, 9, false, "None"))

        answers.add(Answer(37, 10, false, "For sharing the data between applications"))
        answers.add(Answer(38, 10, false, "For storing the data in the database"))
        answers.add(Answer(39, 10, true, "For sending the data from an application to another application"))
        answers.add(Answer(40, 10, false, "None of the above"))

        answers.add(Answer(41, 11, false, "Emulators in Android SDK"))
        answers.add(Answer(42, 11, false, "Android Phone"))
        answers.add(Answer(43, 11, false, "Third-Party Emulator"))
        answers.add(Answer(44, 11, true, "All the above"))

        answers.add(Answer(45, 12, false, "Adapter"))
        answers.add(Answer(46, 12, false, "Activity"))
        answers.add(Answer(47, 12, true, "Fragments"))
        answers.add(Answer(48, 12, false, "None"))

        answers.add(Answer(49, 13, true, "dex compiler"))
        answers.add(Answer(50, 13, false, "Mobile interpretive compare"))
        answers.add(Answer(51, 13, false, "Dalvik converter"))
        answers.add(Answer(52, 13, false, "None"))

        answers.add(Answer(53, 14, false, "system. exit()  method"))
        answers.add(Answer(54, 14, true, "stopSelf() and stopService() method"))
        answers.add(Answer(55, 14, false, "finish() method"))
        answers.add(Answer(56, 14, false, "end() method"))

        answers.add(Answer(57, 15, false, "finishActivity (int requestCode)"))
        answers.add(Answer(58, 15, false, "finish() method"))
        answers.add(Answer(59, 15, false, "neither a and b"))
        answers.add(Answer(60, 15, true, "Both"))

        return answers
    }

}