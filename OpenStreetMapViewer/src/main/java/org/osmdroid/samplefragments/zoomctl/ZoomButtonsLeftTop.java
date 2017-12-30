package org.osmdroid.samplefragments.zoomctl;

import org.osmdroid.samplefragments.BaseSampleFragment;
import org.osmdroid.views.overlay.OverlayLayoutParams;

/**
 * created on 12/29/2017.
 *
 * @author Alex O'Ree
 */

public class ZoomButtonsLeftTop extends BaseSampleFragment {
    @Override
    public String getSampleTitle() {
        return "Top/Left";
    }

    @Override
    public void addOverlays() {
        super.addOverlays();
        mMapView.setBuiltInZoomControls(false);
        mMapView.setBuiltInZoomControls(true, OverlayLayoutParams.LEFT | OverlayLayoutParams.TOP);
    }
}
