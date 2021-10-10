package com.airindexapp.fragments

import android.os.Bundle
import androidx.navigation.NavArgs
import java.lang.IllegalArgumentException
import kotlin.String
import kotlin.jvm.JvmStatic

public data class FragmentHistoryArgs(
  public val cityName: String = "chennai"
) : NavArgs {
  public fun toBundle(): Bundle {
    val result = Bundle()
    result.putString("cityName", this.cityName)
    return result
  }

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): FragmentHistoryArgs {
      bundle.setClassLoader(FragmentHistoryArgs::class.java.classLoader)
      val __cityName : String?
      if (bundle.containsKey("cityName")) {
        __cityName = bundle.getString("cityName")
        if (__cityName == null) {
          throw IllegalArgumentException("Argument \"cityName\" is marked as non-null but was passed a null value.")
        }
      } else {
        __cityName = "chennai"
      }
      return FragmentHistoryArgs(__cityName)
    }
  }
}
