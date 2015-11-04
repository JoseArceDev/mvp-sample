package com.koombea.mvpsample.presenter;

import android.content.Context;

import com.koombea.mvpsample.interactor.GetItemsImplement;
import com.koombea.mvpsample.model.ItemModel;

import java.util.ArrayList;

import de.greenrobot.event.EventBus;

/**
 * Created by koombea on 10/27/15.
 */
public class ItemListViewPresenter implements Presenter {

    private ItemsListView itemsListView;
    private GetItemsImplement getItemsImplement;

    public ItemListViewPresenter(ItemsListView itemsListView){
        this.itemsListView = itemsListView;
        getItemsImplement = new GetItemsImplement();
        EventBus.getDefault().register(this);
    }

    public void initialize(){
        loadItems();
    }

    public void onEvent(ArrayList<ItemModel> event) {
        renderItems(event);
}

    public void onEvent(String event) {
        //renderItems(event);
    }

    private void loadItems() {
        showLoading();
        getListItems();
    }

    @Override
    public void destroy() {
        EventBus.getDefault().unregister(this);
    }

    @Override
    public void resume() {

    }

    @Override
    public void pause() {

    }

    public void showError(String message) {
        itemsListView.showError(message);
    }


    public void selectItem(ItemModel itemModel) {
        itemsListView.selectItem(itemModel);
    }


    public void showLoading() {
        itemsListView.showLoading();
    }


    public void showRetry() {
        itemsListView.showRetry();
    }


    public void hideLoading() {
        itemsListView.hideLoading();
    }


    public void hideRetry() {
        itemsListView.hideRetry();
    }


    public void renderItems(ArrayList<ItemModel> itemModels) {
        itemsListView.renderItems(itemModels);
        itemsListView.hideLoading();
    }

    public Context getContext() {
        return null;
    }

    private void getListItems(){
        getItemsImplement.getListItems();
        //this.getItemListCase.execute(new UserListSubscriber());
    }

}


