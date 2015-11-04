package com.koombea.mvpsample.view.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.koombea.mvpsample.R;
import com.koombea.mvpsample.model.ItemModel;
import com.koombea.mvpsample.presenter.ItemListViewPresenter;
import com.koombea.mvpsample.presenter.ItemsListView;
import com.koombea.mvpsample.view.activity.DetailActivity;
import com.koombea.mvpsample.view.adapter.MyAdapter;

import java.util.ArrayList;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment implements ItemsListView {

    @Bind(R.id.progressBar) ProgressBar progressBar;
    @Bind(R.id.my_recycler_view) RecyclerView mRecyclerView;

    private ItemListViewPresenter mItemListPresenter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_main, container, false);
        ButterKnife.bind(this,view);

        mItemListPresenter = new ItemListViewPresenter(this);

        mRecyclerView.setHasFixedSize(true);
        LinearLayoutManager mLayoutManager = new LinearLayoutManager(getActivity());
        mRecyclerView.setLayoutManager(mLayoutManager);

        mItemListPresenter.initialize();

        return view;
    }

    @Override
    public void hideLoading() {
        progressBar.setVisibility(View.GONE);
    }

    @Override
    public void hideRetry() {

    }

    @Override
    public void selectItem(ItemModel itemModel) {
        Intent intent = new Intent(getActivity(), DetailActivity.class);
        intent.putExtra("name",itemModel.name);
        intent.putExtra("last_name",itemModel.lastName);
        intent.putExtra("carrear",itemModel.carrear);
        startActivity(intent);
    }

    @Override
    public void showError(String message) {
        Toast.makeText(getActivity(),message,Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showRetry() {

    }

    @Override
    public void showLoading() {
        progressBar.setVisibility(View.VISIBLE);
    }

    @Override
    public void renderItems(ArrayList<ItemModel> itemModels) {
        MyAdapter mAdapter = new MyAdapter(itemModels);
        mAdapter.setOnClickListener(onItemClickListener);
        mRecyclerView.setAdapter(mAdapter);
    }

    private MyAdapter.OnItemClickListener onItemClickListener =
            new MyAdapter.OnItemClickListener() {
                @Override public void onUserItemClicked(ItemModel itemModel) {
                    if (MainActivityFragment.this.mItemListPresenter != null && itemModel != null) {
                        MainActivityFragment.this.mItemListPresenter.selectItem(itemModel);
                    }
                }
            };

}
