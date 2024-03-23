package com.example.awesometoast

import android.app.Activity
import android.content.Context
import android.view.LayoutInflater
import android.view.animation.AnimationUtils
import android.widget.ImageView
import android.widget.Toast
import androidx.core.content.ContextCompat
import com.example.awesometoast.databinding.AwesomeToastLayoutBinding

class AwesomeToast {
    companion object {




        // layout inflation
        private lateinit var layoutInflater: LayoutInflater

        // function to create toast
        fun createToast(
            context: Activity,
            title: String,
            desc: String,
            duration:Int,
            style: AwesomeToastStyles,
        ) {
            layoutInflater = LayoutInflater.from(context)
            val binding = AwesomeToastLayoutBinding.inflate(layoutInflater)
            val layout = binding.root

            // setting the layout
            setLayout(binding,context,style)

            // setting title and description
            binding.toastText.text = title
            binding.toastDesc.text = desc


            // init toast
            val toast = Toast(context.applicationContext)


            // setting duration
            toast.duration=duration



            // Setting layout to toast
            toast.view = layout

            // starting animation
            jumpAnimation(context,binding.toastIcon)

            // showing toast
            toast.show()


        }

        private fun jumpAnimation(context: Context, icon: ImageView) {
            val jump = AnimationUtils.loadAnimation(context, R.anim.jump)
            icon.startAnimation(jump)
        }


        private fun setLayout(binding:com.example.awesometoast.databinding.AwesomeToastLayoutBinding, context: Context, style:AwesomeToastStyles?){
            when (style) {
                // Function for Toast Success
                AwesomeToastStyles.SUCCESS -> {
                    binding.toastIcon.setImageDrawable(
                        ContextCompat.getDrawable(
                            context,
                            R.drawable.icon_successfull
                        )
                    )
                    binding.toastType.background =
                        ContextCompat.getDrawable(context, R.drawable.success_toast_background)

                }


                // Function for Toast Error
                AwesomeToastStyles.ERROR -> {

                    binding.toastIcon.setImageDrawable(
                        ContextCompat.getDrawable(
                            context,
                            R.drawable.icon_error
                        )
                    )
                    binding.toastType.background =
                        ContextCompat.getDrawable(context, R.drawable.error_toast_background)

                }


                // Function for Toast Info
                AwesomeToastStyles.INFO -> {

                    binding.toastIcon.setImageDrawable(
                        ContextCompat.getDrawable(
                            context,
                            R.drawable.icon_warning
                        )
                    )
                    binding.toastType.background =
                        ContextCompat.getDrawable(context, R.drawable.info_toast_background)

                }



                // Function for Toast Warning
                AwesomeToastStyles.WARNING -> {

                    binding.toastIcon.setImageDrawable(
                        ContextCompat.getDrawable(
                            context,
                            R.drawable.icon_hand
                        )
                    )
                    binding.toastType.background =
                        ContextCompat.getDrawable(context, R.drawable.warning_toast_background)

                }


                // Function for Toast Delete
                AwesomeToastStyles.DELETE -> {

                    binding.toastIcon.setImageDrawable(
                        ContextCompat.getDrawable(
                            context,
                            R.drawable.icon_delete
                        )
                    )
                    binding.toastType.background =
                        ContextCompat.getDrawable(context, R.drawable.delete_toast_background)


                }


                // Function for Toast with No Internet
                AwesomeToastStyles.NO_INTERNET -> {

                    binding.toastIcon.setImageDrawable(
                        ContextCompat.getDrawable(
                            context,
                            R.drawable.icon_connection_error
                        )
                    )
                    binding.toastType.background =
                        ContextCompat.getDrawable(context, R.drawable.no_internet_toast_background)


                }


                // Function for Toast with Permission Required
                AwesomeToastStyles.PERMISSION_REQUIRED -> {

                    binding.toastIcon.setImageDrawable(
                        ContextCompat.getDrawable(
                            context,
                            R.drawable.icon_permission_required
                        )
                    )
                    binding.toastType.background =
                        ContextCompat.getDrawable(context, R.drawable.permission_toast_background)


                }




                // Function for Default Toast
                AwesomeToastStyles.DEFAULT -> {

                    binding.toastIcon.setImageDrawable(
                        ContextCompat.getDrawable(
                            context,
                            R.drawable.icon_default
                        )
                    )
                    binding.toastType.background =
                        ContextCompat.getDrawable(context, R.drawable.default_toast_background)

                }


                else -> {

                    binding.toastIcon.setImageDrawable(
                        ContextCompat.getDrawable(
                            context,
                            R.drawable.icon_default
                        )
                    )
                    binding.toastType.background =
                        ContextCompat.getDrawable(context, R.drawable.default_toast_background)

                }


            }
        }


    }



}