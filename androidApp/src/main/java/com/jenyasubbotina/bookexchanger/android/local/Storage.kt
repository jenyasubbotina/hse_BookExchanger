package com.jenyasubbotina.bookexchanger.android.local

import android.content.Context
import android.security.keystore.KeyGenParameterSpec
import android.security.keystore.KeyProperties
import androidx.security.crypto.EncryptedSharedPreferences
import androidx.security.crypto.MasterKey

class Storage(context: Context) {

    private val alias = "uz_key"

    private val key = MasterKey.Builder(context, alias)
        .setKeyGenParameterSpec(
            KeyGenParameterSpec.Builder(
                alias,
                KeyProperties.PURPOSE_ENCRYPT or KeyProperties.PURPOSE_DECRYPT
            ).apply {
                setBlockModes(KeyProperties.BLOCK_MODE_GCM)
                setEncryptionPaddings(KeyProperties.ENCRYPTION_PADDING_NONE)
                setKeySize(256)
                setUserAuthenticationRequired(false)
            }.build()
        ).build()


    private val sharedPreferences = EncryptedSharedPreferences.create(
        context,
        "account_data",
        key,
        EncryptedSharedPreferences.PrefKeyEncryptionScheme.AES256_SIV,
        EncryptedSharedPreferences.PrefValueEncryptionScheme.AES256_GCM
    )

    fun get(key: String): String? {
        return sharedPreferences.getString(key, null)
    }

    fun save(key: String, value: String) {
        sharedPreferences.edit().putString(key, value).apply()
    }

    fun save(saved: Map<String, String>) {
        val editor = sharedPreferences.edit()
        saved.forEach { (k, v) ->
            editor.putString(k, v)
        }
        editor.apply()
    }

    fun removeAll(keys: List<String>){
        val editor = sharedPreferences.edit()
        keys.forEach(editor::remove)
        editor.apply()
    }

    fun remove(key: String){
        sharedPreferences.edit()
            .remove(key)
            .apply()
    }

}