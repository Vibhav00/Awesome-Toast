package com.example.awesometoast

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import android.widget.ImageView
import android.widget.Toast
import com.example.awesometoast.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var activityMainBinding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        activityMainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(activityMainBinding.root)



        activityMainBinding.apply {
            success.setOnClickListener {
                AwesomeToast.createToast(
                    this@MainActivity,
                    "Successfully Saved ",
                    "Your item was saved successfully ",
                    Toast.LENGTH_SHORT,
                    AwesomeToastStyles.SUCCESS,
                )
            }
            delete.setOnClickListener {
                AwesomeToast.createToast(
                    this@MainActivity,
                    "Item Deleted ",
                    "item was  deleted ",
                    Toast.LENGTH_SHORT,
                    AwesomeToastStyles.DELETE,
                )
            }
            info.setOnClickListener {
                AwesomeToast.createToast(
                    this@MainActivity,
                    "Please Enter Email ",
                    "Email Should not be Empty ",
                    Toast.LENGTH_SHORT,
                    AwesomeToastStyles.INFO,
                )

            }
            warning.setOnClickListener {
                AwesomeToast.createToast(
                    this@MainActivity,
                    "Provide strong password ",
                    "password must contain one number ",
                    Toast.LENGTH_SHORT,
                    AwesomeToastStyles.WARNING,
                )
            }
            error.setOnClickListener {
                AwesomeToast.createToast(
                    this@MainActivity,
                    "Failed to Save ",
                    "Error while saving the item  ",
                    Toast.LENGTH_SHORT,
                    AwesomeToastStyles.ERROR,
                )

            }
            noInternet.setOnClickListener {
                AwesomeToast.createToast(
                    this@MainActivity,
                    "Connection Problem  ",
                    "internet or wifi is not available ",
                    Toast.LENGTH_SHORT,
                    AwesomeToastStyles.NO_INTERNET,
                )

            }
            permissionRequired.setOnClickListener {

                AwesomeToast.createToast(
                    this@MainActivity,
                    "Permission Required",
                    "Permission for internet is Required ",
                    Toast.LENGTH_SHORT,
                    AwesomeToastStyles.PERMISSION_REQUIRED,
                )

            }

            defaultBtn.setOnClickListener {
                AwesomeToast.createToast(
                    this@MainActivity,
                    "Hello Everyone ",
                    "Welcome to this app ",
                    Toast.LENGTH_SHORT,
                    AwesomeToastStyles.DEFAULT,
                )

            }

        }

    }
}