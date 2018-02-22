package aulas.ddmi.webservice_carros.service;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonGetter;

import aulas.ddmi.webservice_carros.dto.CarroSync;
import aulas.ddmi.webservice_carros.model.Carro;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

/**
 * Created by vagner on 22/02/18.
 */

public interface CarroService {
    //Call faz a chamada para o servidor.
    //Ela realiza a requisição em URL_BASE/*

    @GET("carros")
    Call<CarroSync> getCarros();

    @GET("carros/tipo/{tipo}")
    Call<CarroSync> getCarrosByTipo(@Path("tipo") String tipo);

    @POST("carros")
    Call<Void> inserir(@Body Carro carro); //define a assinatura do método
}
