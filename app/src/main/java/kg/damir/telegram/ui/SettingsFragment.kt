package kg.damir.telegram.ui

import android.view.Menu
import android.view.MenuInflater
import kg.damir.telegram.R

class SettingsFragment : BaseFragment(R.layout.fragment_settings) {

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        activity?.menuInflater?.inflate(R.menu.settings_action_menu, menu)

    }

    override fun onResume() {
        super.onResume()
        setHasOptionsMenu(true)

    }
}