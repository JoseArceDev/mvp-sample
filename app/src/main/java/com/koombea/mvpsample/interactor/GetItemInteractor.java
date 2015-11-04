package com.koombea.mvpsample.interactor;

import com.koombea.mvpsample.presenter.ItemListViewPresenter;

/**
 * Created by koombea on 11/4/15.
 */
public interface GetItemInteractor {

    void getListItems();
    void getListItems(ItemListViewPresenter presenter);
}
