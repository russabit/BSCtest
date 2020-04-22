package ru.ruslan.bsctest

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import ru.ruslan.bsctest.utils.Account
import ru.ruslan.bsctest.utils.AccountsCreator

class MyViewModel(application: Application) : AndroidViewModel(application) {

    private val accountsList: ArrayList<Account> = AccountsCreator.getAccountsList()
    private val rurList = accountsList.filter { it.currencyName == "RUR" }
    private val usdList = accountsList.filter { it.currencyName == "USD" }
    private val eurList = accountsList.filter { it.currencyName == "EUR" }
    val finalList = rurList.plus(usdList).plus(eurList)
}