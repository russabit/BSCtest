package ru.ruslan.bsctest.utils

import ru.ruslan.bsctest.R

class AccountsCreator {
    companion object {
        fun <ArrayList> getAccountsList(): ArrayList {
            var accountsList = ArrayList<Account>()

            //accountsList.add(Account("RUR", 124128, R.drawable.rur_image))
            accountsList.add(Rur("RUR", 124128.73, R.drawable.rur_image))
            accountsList.add(Eur("EUR", R.drawable.eur_image))
            accountsList.add(Usd("USD", 8372.21, R.drawable.usd_image))
            return accountsList as ArrayList
        }
    }
}

open class Account()

class Rur(val CurrencyName: String,
          val Balance: Double,
          val CurrencyPicture: Int) : Account()

class Usd(val CurrencyName: String,
          val Balance: Double,
          val CurrencyPicture: Int) : Account()

class Eur(val CurrencyName: String,
          val CurrencyPicture: Int) : Account()


