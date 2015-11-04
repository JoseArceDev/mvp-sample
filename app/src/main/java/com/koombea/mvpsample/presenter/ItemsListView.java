package com.koombea.mvpsample.presenter;

import com.koombea.mvpsample.model.ItemModel;

import java.util.ArrayList;

/**
 * Created by koombea on 10/27/15.
 */
public interface ItemsListView extends LoadDataView {

    void selectItem(ItemModel itemModel);

    void renderItems(ArrayList<ItemModel> itemModels);

}
