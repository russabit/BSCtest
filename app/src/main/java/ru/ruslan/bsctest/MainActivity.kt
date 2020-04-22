package ru.ruslan.bsctest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.hannesdorfmann.adapterdelegates4.ListDelegationAdapter
import kotlinx.android.synthetic.main.activity_main.*
import ru.ruslan.bsctest.adapters.eurAdapterDelegate
import ru.ruslan.bsctest.adapters.rurAdapterDelegate
import ru.ruslan.bsctest.adapters.usdAdapterDelegate
import ru.ruslan.bsctest.utils.Account

class MainActivity : AppCompatActivity() {

    private val viewModel: MyViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = list_of_accounts

        val adapter = ListDelegationAdapter(
            rurAdapterDelegate(),
            usdAdapterDelegate(),
            eurAdapterDelegate()
        )

        adapter.items = viewModel.finalList
        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(this)
    }
}
