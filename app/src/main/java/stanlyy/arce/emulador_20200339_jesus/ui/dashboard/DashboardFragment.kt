package stanlyy.arce.emulador_20200339_jesus.ui.dashboard

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import stanlyy.arce.emulador_20200339_jesus.R
import stanlyy.arce.emulador_20200339_jesus.databinding.FragmentDashboardBinding

class DashboardFragment : Fragment() {

    private var _binding: FragmentDashboardBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View {
        val dashboardViewModel =
                ViewModelProvider(this).get(DashboardViewModel::class.java)


        val root = FragmentDashboardBinding.inflate(inflater, container, false).root
        val btn_nom = root.findViewById<Button>(R.id.btn_nom)
        val lb_nom = root.findViewById<TextView>(R.id.lb_nom)
        btn_nom.setOnClickListener{
            lb_nom.text = "Jesús Stanley Arce"
        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}