package com.koombea.mvpsample.interactor;

import android.os.Handler;

import com.koombea.mvpsample.domain.GetListItem;
import com.koombea.mvpsample.presenter.ItemListViewPresenter;

import de.greenrobot.event.EventBus;

/**
 * Created by koombea on 11/4/15.
 */
public class GetItemsImplement implements GetItemInteractor {

    @Override
    public void getListItems() {
        new Handler().postDelayed(new Runnable() {
            @Override public void run() {
                EventBus.getDefault().post(GetListItem.mockGetListItem());
            }
        }, 4000);
    }

    @Override
    public void getListItems(final ItemListViewPresenter presenter) {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                presenter.renderItems(GetListItem.mockGetListItem());
            }
        }, 4000);
    }

}
