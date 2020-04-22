package ru.ruslan.bsctest.adapters

import android.widget.ImageView
import android.widget.TextView
import com.hannesdorfmann.adapterdelegates4.dsl.adapterDelegate
import ru.ruslan.bsctest.R
import ru.ruslan.bsctest.utils.Account
import ru.ruslan.bsctest.utils.Eur
import ru.ruslan.bsctest.utils.Rur
import ru.ruslan.bsctest.utils.Usd

fun rurAdapterDelegate() = adapterDelegate<Rur, Account>(R.layout.recyclerview_listitem_account_rur) {
    val name = findViewById<TextView>(R.id.rur_currency_name)
    val image = findViewById<ImageView>(R.id.rur_currency_picture)
    val amount = findViewById<TextView>(R.id.rur_amount)

    bind {
        name.text = item.CurrencyName //item is set to the current bound item from List<Currencies>. Item is of type Rur
        image.setImageResource(item.CurrencyPicture)
        amount.text = item.Balance.toString()
    }
}

fun usdAdapterDelegate() = adapterDelegate<Usd, Account>(R.layout.recyclerview_listitem_account_usd) {
    val name = findViewById<TextView>(R.id.usd_currency_name)
    val image = findViewById<ImageView>(R.id.usd_currency_picture)
    val amount = findViewById<TextView>(R.id.usd_amount)

    bind {
        name.text = item.CurrencyName //item is set to the current bound item from List<Currencies>. Item is of type Usd
        image.setImageResource(item.CurrencyPicture)
        amount.text = item.Balance.toString()
    }
}

fun eurAdapterDelegate() = adapterDelegate<Eur, Account>(R.layout.recyclerview_listitem_account_eur) {
    val name = findViewById<TextView>(R.id.eur_currency_name)
    val image = findViewById<ImageView>(R.id.eur_currency_picture)

    bind {
        name.text = item.CurrencyName //item is set to the current bound item from List<Currencies>. Item is of type Usd
        image.setImageResource(item.CurrencyPicture)
    }
}


