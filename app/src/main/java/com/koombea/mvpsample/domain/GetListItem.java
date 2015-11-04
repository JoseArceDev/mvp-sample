package com.koombea.mvpsample.domain;

import com.koombea.mvpsample.model.ItemModel;

import java.util.ArrayList;

/**
 * Created by koombea on 10/28/15.
 */
public class GetListItem {

    public static ArrayList<ItemModel>  mockGetListItem(){

        ArrayList<ItemModel> itemModels = new ArrayList<>();
        ItemModel itemModel = new ItemModel();
        itemModel.name = "Name 1";
        itemModel.carrear = "Carrear 1";
        itemModel.lastName = "Last name 1";
        itemModels.add(itemModel);

        ItemModel itemModel2 = new ItemModel();
        itemModel2.name = "Name 2";
        itemModel2.carrear = "Carrear 2";
        itemModel2.lastName = "Last Name 2";
        itemModels.add(itemModel2);

        ItemModel itemModel3 = new ItemModel();
        itemModel3.name = "Name 3";
        itemModel3.carrear = "Carrear 3";
        itemModel3.lastName = "Last Name 3";
        itemModels.add(itemModel3);

        ItemModel itemModel4 = new ItemModel();
        itemModel4.name = "Name 4";
        itemModel4.carrear = "Carrear 4";
        itemModel4.lastName = "Last Name 4";
        itemModels.add(itemModel4);

        ItemModel itemModel5 = new ItemModel();
        itemModel5.name = "Name 5";
        itemModel5.carrear = "Carrear 5";
        itemModel5.lastName = "Last Name 5";
        itemModels.add(itemModel5);

        ItemModel itemModel6 = new ItemModel();
        itemModel6.name = "Name 1";
        itemModel6.carrear = "Carrear 1";
        itemModel6.lastName = "Last name 1";
        itemModels.add(itemModel6);

        ItemModel itemModel7 = new ItemModel();
        itemModel7.name = "Name 2";
        itemModel7.carrear = "Carrear 2";
        itemModel7.lastName = "Last Name 2";
        itemModels.add(itemModel7);

        ItemModel itemModel8 = new ItemModel();
        itemModel8.name = "Name 3";
        itemModel8.carrear = "Carrear 3";
        itemModel8.lastName = "Last Name 3";
        itemModels.add(itemModel8);

        ItemModel itemModel9 = new ItemModel();
        itemModel9.name = "Name 4";
        itemModel9.carrear = "Carrear 4";
        itemModel9.lastName = "Last Name 4";
        itemModels.add(itemModel9);

        ItemModel itemModel10 = new ItemModel();
        itemModel10.name = "Name 5";
        itemModel10.carrear = "Carrear 5";
        itemModel10.lastName = "Last Name 5";
        itemModels.add(itemModel10);

        return itemModels;
    }

}
