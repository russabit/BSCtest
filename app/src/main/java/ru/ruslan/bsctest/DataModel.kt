package ru.ruslan.bsctest

import ru.ruslan.bsctest.utils.Account
import ru.ruslan.bsctest.utils.AccountsCreator

class DataModel {
    val accountsList: ArrayList<Account> = AccountsCreator.getAccountsList()
}