package com.example.unimarket_dv;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SearchView;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

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


}
