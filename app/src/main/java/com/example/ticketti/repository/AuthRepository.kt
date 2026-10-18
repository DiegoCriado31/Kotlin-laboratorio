package com.example.ticketti.repository

import com.example.ticketti.model.Credential

class AuthRepository (
    private val validCredential: Credential = Credential.Admin)
{

    fun login(username:String, password:String):Boolean{
        return username== validCredential.username && password==validCredential.password
    }

}