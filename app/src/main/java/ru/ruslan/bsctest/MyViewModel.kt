package ru.ruslan.bsctest

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import ru.ruslan.bsctest.utils.Account
import ru.ruslan.bsctest.utils.AccountsCreator

class MyViewModel(application: Application) : AndroidViewModel(application) {

    val accountsList: ArrayList<Account> = AccountsCreator.getAccountsList()

    //logic to sort the list and then expose it with liveData to the view
    
}