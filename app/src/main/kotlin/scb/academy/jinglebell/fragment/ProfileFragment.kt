package scb.academy.jinglebell.fragment

import android.os.Bundle
import android.view.KeyEvent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_profile.*
import scb.academy.jinglebell.R


class ProfileFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_profile, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        textView2.visibility = View.GONE
        super.onViewCreated(view, savedInstanceState)
        onEnter()

    }

    private fun onEnter(){
        editText.setOnKeyListener(View.OnKeyListener { v, keyCode, event ->
            if (keyCode == KeyEvent.KEYCODE_ENTER && event.action == KeyEvent.ACTION_UP) {
                textView.text = getString(R.string.welcome_label)
                editText.visibility = View.GONE
                textView2.text = editText.text
                textView2.visibility = View.VISIBLE
                return@OnKeyListener true
            }
            false
        })
    }


}
