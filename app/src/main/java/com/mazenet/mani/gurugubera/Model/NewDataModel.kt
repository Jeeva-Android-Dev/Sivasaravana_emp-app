package com.mazenet.mani.gurugubera.Model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class NewDataModel {

    @SerializedName("available_advance_before_enrol")
    @Expose
    private var availbleadvanceenroll: String? = null
    /**
     * No args constructor for use in serialization
     *
     */

    /**
     *
     * @param availableadvanceenroll
     */
    fun NewDataModel(
        availableadvanceenroll:String
    ){
        this.availbleadvanceenroll= availableadvanceenroll

    }

    fun getavailableenroll():String?{
        return availbleadvanceenroll
    }
    fun setavailableenroll(availbleadvanceenroll: String){
        this.availbleadvanceenroll= availbleadvanceenroll
    }
}