package com.sariaydinalparslan.cryptoapp.service

import com.sariaydinalparslan.cryptoapp.model.CryptoModel
import io.reactivex.Observable
import retrofit2.Call
import retrofit2.http.GET
//https://raw.githubusercontent.com/
// atilsamancioglu/K21-JSONDataSet/master/crypto.json
interface CryptoAPI {
    @GET("atilsamancioglu/K21-JSONDataSet/master/crypto.json")
    fun getData(): Observable<List<CryptoModel>>
}