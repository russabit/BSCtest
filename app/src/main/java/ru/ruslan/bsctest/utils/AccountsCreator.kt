package ru.ruslan.bsctest.utils

import ru.ruslan.bsctest.R
import java.util.*
import kotlin.collections.ArrayList

class AccountsCreator {
    companion object {
        fun getAccountsList(): ArrayList<Account> {
            val accountsList = ArrayList<Account>()

            //accountsList.add(Account("RUR", 124128, R.drawable.rur_image))
            accountsList.add(Rur(balance = Random().nextDouble().times(100000).round()))
            accountsList.add(Usd(balance = Random().nextDouble().times(10000).round()))
            accountsList.add(Rur(balance = Random().nextDouble().times(100000).round()))
            accountsList.add(Rur(balance = Random().nextDouble().times(100000).round()))
            accountsList.add(Eur())
            accountsList.add(Eur())
            accountsList.add(Usd(balance = Random().nextDouble().times(100000).round()))
            accountsList.add(Rur(balance = Random().nextDouble().times(100000).round()))
            accountsList.add(Usd(balance = Random().nextDouble().times(10000).round()))
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


fun Double.round(decimals: Int = 2): Double =
    "%.${decimals}f".format(this).toDouble()


