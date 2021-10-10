package com.airindexapp.fragments

import android.os.Bundle
import androidx.navigation.NavDirections
import com.airindexapp.R
import kotlin.Int
import kotlin.String

public class FragmentHomeDirections private constructor() {
  private data class ActionFragmentHomeToFragmentHistory(
    public val cityName: String = "chennai"
  ) : NavDirections {
    public override fun getActionId(): Int = R.id.action_fragmentHome_to_fragmentHistory

    public override fun getArguments(): Bundle {
      val result = Bundle()
      result.putString("cityName", this.cityName)
      return result
    }
  }

  public companion object {
    public fun actionFragmentHomeToFragmentHistory(cityName: String = "chennai"): NavDirections =
        ActionFragmentHomeToFragmentHistory(cityName)
  }
}
