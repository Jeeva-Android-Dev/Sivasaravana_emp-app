package com.mazenet.mani.gurugubera.Model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class AdvanceModel {
    @SerializedName("data")
    @Expose
    private var data: ArrayList<NewDataModel>? = null
    @SerializedName("status")
    @Expose
    private var status: String? = null
    @SerializedName("msg")
    @Expose
    private var msg: String? = null
    /**
     * No args constructor for use in serialization
     *
     */

    /**
     *
     * @param data
     * @param status
     * @param msg
     */
    fun AdvanceModel(
        data: ArrayList<NewDataModel>,
        status:String,
        msg:String
    ){
        this.data = data
        this.status = status
        this.msg= msg

    }
    fun getData(): ArrayList<NewDataModel>? {
        return data
    }

    fun setData(data: ArrayList<NewDataModel>) {
        this.data = data
    }

    fun getavailbleenrolstatus():String?{
        return  status
    }
    fun setavailblenrollstatus(status: String){
        this.status = status
    }
    fun getavailablemsg():String?{
        return msg
    }
    fun setavailablemsg(msg: String){
        this.msg= msg
    }
}