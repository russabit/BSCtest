package ru.ruslan.bsctest.utils

import ru.ruslan.bsctest.R
import kotlin.collections.ArrayList

class AccountsCreator {
    companion object {
        fun getAccountsList(): ArrayList<Account> {
            val accountsList = ArrayList<Account>()
            accountsList.add(Rur(balance = 37232.24))
            accountsList.add(Usd(balance = 1242142.21))
            accountsList.add(Rur(balance = 124231.32))
            accountsList.add(Rur(balance = 74620.12))
            accountsList.add(Eur())
            accountsList.add(Eur())
            accountsList.add(Usd(balance = 1243.64))
            accountsList.add(Rur(balance = 25732.12))
            accountsList.add(Usd(balance = 756.21))
            return accountsList
        }
    }
}

sealed class Account(open val currencyName: String)

data class Rur(
    override val currencyName: String = "RUR",
    val balance: Double,
    val currencyPicture: Int = R.drawable.rur_image) : Account(currencyName)

data class Usd(override val currencyName: String = "USD",
          val balance: Double,
          val currencyPicture: Int = R.drawable.usd_image) : Account(currencyName)

data class Eur(override val currencyName: String = "EUR",
          val currencyPicture: Int = R.drawable.eur_image) : Account(currencyName)

