package com.ecaray.share.applike;

import com.ecaray.component.componentlib.applicationlike.IApplicationLike;
import com.ecaray.component.componentlib.router.ui.UIRouter;
import com.ecaray.share.compouirouter.ShareUIRouter;

/**
 * Created by mrzhang on 2017/6/15.
 */

public class ShareApplike implements IApplicationLike {

    UIRouter uiRouter = UIRouter.getInstance();
    ShareUIRouter shareUIRouter = ShareUIRouter.getInstance();

    @Override
    public void onCreate() {
        uiRouter.registerUI(shareUIRouter);
    }

    @Override
    public void onStop() {
        uiRouter.unregisterUI(shareUIRouter);
    }
}
