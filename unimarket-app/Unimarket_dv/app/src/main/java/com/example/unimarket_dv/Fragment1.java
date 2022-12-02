package com.example.unimarket_dv;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SearchView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Callback;


public class Fragment1 extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        ViewGroup frag1V = (ViewGroup) inflater.inflate(R.layout.fragment1, container, false);

        SearchView searchBar = frag1V.findViewById(R.id.searchView1);
        searchBar.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String s) {
                // 입력받은 문자열 처리

                Toast.makeText(getActivity(),s, Toast.LENGTH_LONG).show();

                //Call<data_model> call;
//                call = retrofit_client.getApiService().test_api_get("207092540");
//                call.enqueue(new Callback<data_model>(){
//                    //콜백 받는 부분
//                    @Override
//                    public void onResponse(Call<data_model> call, Response<data_model> response) {
//                        data_model result = response.body();
//                        String str;
//                        str= result.getUserId();
//                        Toast.makeText(getActivity(),str, Toast.LENGTH_LONG).show();
//                    }
//
//                    @Override
//                    public void onFailure(Call<data_model> call, Throwable t) {
//
//                    }
//                });

                return true;    //리스너로 처리할 떄 true반환?
            }

            @Override
            public boolean onQueryTextChange(String s) {
                // 입력란의 문자열이 바뀔 때 처리
                //Toast.makeText(getActivity(), "입력값 수정", Toast.LENGTH_LONG).show();
                return false;
            }
        });


        return frag1V;
    }
//    public class Jsonq {
//        String device;
//        String keyword;
//        String region;
//        String filter;
//        int minprice;
//        int maxprice;
//
//        Jsonq(String key){
//            keyword = key;
//        }
//    }


}
