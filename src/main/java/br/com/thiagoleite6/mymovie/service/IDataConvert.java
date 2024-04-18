package br.com.thiagoleite6.mymovie.service;

public interface IDataConvert {
     <T> T getData(String json, Class<T> dataClass);
}
