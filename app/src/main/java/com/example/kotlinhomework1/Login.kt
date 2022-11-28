package com.example.kotlinhomework1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.google.android.material.textfield.TextInputEditText

class Login : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    )
            : View? {

        return inflater.inflate(R.layout.fragment_login, container, false)}
        override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
            super.onViewCreated(view, savedInstanceState)

            val mainScreen = view.findViewById<Button>(R.id.btnLogin)
            val needRegistration = view.findViewById<Button>(R.id.btnRegistration)
            needRegistration.setOnClickListener{
                parentFragmentManager
                    .beginTransaction()
                    .add(R.id.activity_container, Registration())
                    .addToBackStack("login_screen")
                    .commit()
            }

            val editText = view.findViewById<TextInputEditText>(R.id.et_text1)
            val editText2 = view.findViewById<TextInputEditText>(R.id.et_text2)

            mainScreen.setOnClickListener{

                if(editText.text.toString().isEmpty()){
                    editText.error = "field username can't be empty"

                }else if(editText2.text.toString().isEmpty()){
                    editText2.error = "field password can't be empty"
                }
                else {
                    parentFragmentManager
                        .beginTransaction()
                        .replace(R.id.activity_container, MainScreen())
                        .commit()
                }
            }
        }
}
