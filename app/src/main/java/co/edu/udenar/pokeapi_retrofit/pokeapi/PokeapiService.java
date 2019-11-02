package co.edu.udenar.pokeapi_retrofit.pokeapi;

import co.edu.udenar.pokeapi_retrofit.models.PokemonRespuesta;
import retrofit2.Call;
import retrofit2.http.GET;

public interface PokeapiService {
    //aqui se coloca la ultima parte
    @GET("pokemon")
    Call<PokemonRespuesta> obtenerListaPokemon();
}
