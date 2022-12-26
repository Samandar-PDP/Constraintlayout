package uz.digital.constraintlayout

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.AppCompatButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val login: AppCompatButton = findViewById(R.id.login)
        val register: AppCompatButton = findViewById(R.id.register)

        login.setOnClickListener {
            intent(LoginActivity())
        }
        register.setOnClickListener {
            intent(RegisterActivity())
        }
    }

    private fun intent(activity: Activity) {
        startActivity(Intent(this, activity::class.java))
    }
}