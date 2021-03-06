package com.example.scoutconcordia;

import android.graphics.BitmapFactory;
import android.view.View;
import com.example.scoutconcordia.Activities.MapsActivity;
import com.google.android.gms.maps.model.BitmapDescriptor;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.GroundOverlayOptions;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Polygon;
import com.google.maps.android.PolyUtil;
import static com.example.scoutconcordia.Directions.displaySearchResults;
import static com.example.scoutconcordia.Directions.getDirections;

/** This class is used as a helper class to the MapsActivity and adds all the button listeners for
 *  the various buttons placed throughout the application */
public class ExternalButtonListener extends MapsActivity {

    public static void setUpGroundOverlay(String image)
    {
        BitmapFactory.Options dimensions = new BitmapFactory.Options();
        dimensions.inJustDecodeBounds = true;
        float imgRotation = -56;
        float overlaySize = 75;
        BitmapDescriptor floorPlan = BitmapDescriptorFactory.fromResource(getmContext().getResources().getIdentifier(image, DRAWABLE, getmContext().getPackageName()));

        hallGroundOverlay = mMap.addGroundOverlay(new GroundOverlayOptions()
                .image(floorPlan)
                .position(hallOverlaySouthWest, overlaySize)
                .anchor(0, 1)
                .bearing(imgRotation));
    }

    /** Method for adding on click listeners for the floor1 button. */
    public static void addfloor1ButtonListener()
    {
        floor1.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View view) {
                resetButtonColors();
                floor1.setBackgroundColor(getmContext().getResources().getColor(R.color.burgandy));
                floor1.setTextColor(getmContext().getResources().getColor((R.color.faintGray)));
                removeAllFloorOverlays();
                setUpGroundOverlay("hall1p");
            }
        });
    }

    /** Method for adding on click listeners for the floor2 button. */
    public static void addfloor2ButtonListener()
    {
        floor2.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View view) {
                resetButtonColors();
                floor2.setBackgroundColor(getmContext().getResources().getColor(R.color.burgandy));
                floor2.setTextColor(getmContext().getResources().getColor((R.color.faintGray)));
                removeAllFloorOverlays();
                setUpGroundOverlay("hall2floor");
            }
        });
    }

    /** Method for adding on click listeners for the floor8 button. */
    public static void addfloor8ButtonListener()
    {
        floor8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                resetButtonColors();
                floor8.setBackgroundColor(getmContext().getResources().getColor(R.color.burgandy));
                floor8.setTextColor(getmContext().getResources().getColor((R.color.faintGray)));
                removeAllFloorOverlays();
                setUpGroundOverlay("hall8p");
            }
        });
    }

    /** Method for adding on click listeners for the floor9 button. */
    public static void addfloor9ButtonListener()
    {
        floor9.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                resetButtonColors();
                floor9.setBackgroundColor(getmContext().getResources().getColor(R.color.burgandy));
                floor9.setTextColor(getmContext().getResources().getColor((R.color.faintGray)));
                removeAllFloorOverlays();
                setUpGroundOverlay("hall9p");
            }
        });
    }

    /** Method for adding on click listeners for the CC floor 1 button. */
    public static void addfloorCC1ButtonListener()
    {
        floorCC1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                resetButtonColors();
                floorCC1.setBackgroundColor(getmContext().getResources().getColor(R.color.burgandy));
                floorCC1.setTextColor(getmContext().getResources().getColor((R.color.faintGray)));
                removeAllFloorOverlays();

                BitmapFactory.Options dimensions = new BitmapFactory.Options();
                dimensions.inJustDecodeBounds = true;
                float imgRotation = 29;
                float overlaySize = 82;
                BitmapDescriptor floorPlan = BitmapDescriptorFactory.fromResource(getmContext().getResources().getIdentifier("cc_building1", DRAWABLE, getmContext().getPackageName()));

                ccGroundOverlay = mMap.addGroundOverlay(new GroundOverlayOptions()
                        .image(floorPlan)
                        .position(ccOverlaySouthWest, overlaySize)
                        .anchor(0, 1)
                        .bearing(imgRotation));
            }
        });
    }

    /** Method for adding on click listeners for the CC floor 2 button. */
    public static void addfloorCC2ButtonListener()
    {
        floorCC2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                resetButtonColors();
                floorCC2.setBackgroundColor(getmContext().getResources().getColor(R.color.burgandy));
                floorCC2.setTextColor(getmContext().getResources().getColor((R.color.faintGray)));
                removeAllFloorOverlays();

                BitmapFactory.Options dimensions = new BitmapFactory.Options();
                dimensions.inJustDecodeBounds = true;
                float imgRotation = 29;
                float overlaySize = 82;
                BitmapDescriptor floorPlan = BitmapDescriptorFactory.fromResource(getmContext().getResources().getIdentifier("cc_building2", DRAWABLE, getmContext().getPackageName()));

                ccGroundOverlay = mMap.addGroundOverlay(new GroundOverlayOptions()
                        .image(floorPlan)
                        .position(ccOverlaySouthWest, overlaySize)
                        .anchor(0, 1)
                        .bearing(imgRotation));
            }
        });
    }

    /** Method for adding on click listeners for the VE floor 2 button. */
    public static void addfloorVE2ButtonListener()
    {
        floorVE2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                resetButtonColors();
                floorVE2.setBackgroundColor(getmContext().getResources().getColor(R.color.burgandy));
                floorVE2.setTextColor(getmContext().getResources().getColor((R.color.faintGray)));
                removeAllFloorOverlays();

                BitmapFactory.Options dimensions = new BitmapFactory.Options();
                dimensions.inJustDecodeBounds = true;
                float imgRotation = 29;
                float overlaySize = 50;
                BitmapDescriptor floorPlan = BitmapDescriptorFactory.fromResource(getmContext().getResources().getIdentifier("ve_floor2", DRAWABLE, getmContext().getPackageName()));

                veGroundOverlay = mMap.addGroundOverlay(new GroundOverlayOptions()
                        .image(floorPlan)
                        .position(veBuildingOverlaySouthWest, overlaySize)
                        .anchor(0, 1)
                        .bearing(imgRotation));
            }
        });
    }

    /** Method for adding on click listeners for the VL floor 1 button. */
    public static void addfloorVL1ButtonListener()
    {
        floorVL1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                resetButtonColors();
                floorVL1.setBackgroundColor(getmContext().getResources().getColor(R.color.burgandy));
                floorVL1.setTextColor(getmContext().getResources().getColor((R.color.faintGray)));
                removeAllFloorOverlays();

                BitmapFactory.Options dimensions = new BitmapFactory.Options();
                dimensions.inJustDecodeBounds = true;
                float imgRotation = 209;
                float overlaySize = 71;
                BitmapDescriptor floorPlan = BitmapDescriptorFactory.fromResource(getmContext().getResources().getIdentifier("vl_001", DRAWABLE, getmContext().getPackageName()));

                vlGroundOverlay = mMap.addGroundOverlay(new GroundOverlayOptions()
                        .image(floorPlan)
                        .position(vlBuildingOverlaySouthWest, overlaySize)
                        .anchor(0, 1)
                        .bearing(imgRotation));
            }
        });
    }

    /** Method for adding on click listeners for the VL floor 2 button. */
    public static void addfloorVL2ButtonListener()
    {
        floorVL2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                resetButtonColors();
                floorVL2.setBackgroundColor(getmContext().getResources().getColor(R.color.burgandy));
                floorVL2.setTextColor(getmContext().getResources().getColor((R.color.faintGray)));
                removeAllFloorOverlays();

                BitmapFactory.Options dimensions = new BitmapFactory.Options();
                dimensions.inJustDecodeBounds = true;
                float imgRotation = 209;
                float overlaySize = 71;
                BitmapDescriptor floorPlan = BitmapDescriptorFactory.fromResource(getmContext().getResources().getIdentifier("vl_002", DRAWABLE, getmContext().getPackageName()));

                vlGroundOverlay = mMap.addGroundOverlay(new GroundOverlayOptions()
                        .image(floorPlan)
                        .position(vlBuildingOverlaySouthWest, overlaySize)
                        .anchor(0, 1)
                        .bearing(imgRotation));
            }
        });
    }

    /** Method for adding on click listeners for the MB floor 1 button. */
    public static void addfloorMB1ButtonListener()
    {
        floorMB1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                resetButtonColors();
                floorMB1.setBackgroundColor(getmContext().getResources().getColor(R.color.burgandy));
                floorMB1.setTextColor(getmContext().getResources().getColor((R.color.faintGray)));
                removeAllFloorOverlays();

                BitmapFactory.Options dimensions = new BitmapFactory.Options();
                dimensions.inJustDecodeBounds = true;
                float imgRotation = -56;
                float overlaySize = 42;
                BitmapDescriptor floorPlan = BitmapDescriptorFactory.fromResource(getmContext().getResources().getIdentifier("mb_01", DRAWABLE, getmContext().getPackageName()));

                mbGroundOverlay = mMap.addGroundOverlay(new GroundOverlayOptions()
                        .image(floorPlan)
                        .position(mbBuildingOverlaySouthWest, overlaySize)
                        .anchor(0, 1)
                        .bearing(imgRotation));
            }
        });
    }

    /** Method for adding on click listeners for the MB floor 2 button. */
    public static void addfloorMBS2ButtonListener()
    {
        floorMBS2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                resetButtonColors();
                floorMBS2.setBackgroundColor(getmContext().getResources().getColor(R.color.burgandy));
                floorMBS2.setTextColor(getmContext().getResources().getColor((R.color.faintGray)));
                removeAllFloorOverlays();

                BitmapFactory.Options dimensions = new BitmapFactory.Options();
                dimensions.inJustDecodeBounds = true;
                float imgRotation = -56;
                float overlaySize = 42;
                BitmapDescriptor floorPlan = BitmapDescriptorFactory.fromResource(getmContext().getResources().getIdentifier("mb_s02", DRAWABLE, getmContext().getPackageName()));

                mbGroundOverlay = mMap.addGroundOverlay(new GroundOverlayOptions()
                        .image(floorPlan)
                        .position(mbBuildingOverlaySouthWest, overlaySize)
                        .anchor(0, 1)
                        .bearing(imgRotation));
            }
        });
    }

    /**
     * This method hides the polygon based on which building is being accessed through the
     * 'explore inside' button
     * @param poly polygons of buildings
     */
    public static void getInside(Polygon poly){
        poly.setVisible(false);  // hide the polygon
        searchMarker.setVisible(false);  // hide the marker
        removeAllFloorOverlays();

        if (poly.getTag().equals("H Building"))
            setHallButtonsVisibility(true);
        else if (poly.getTag().equals("CC Building"))
            setCCButtonsVisibility(true);
        else if (poly.getTag().equals("VE Building"))
            setVEButtonsVisibility(true);
        else if (poly.getTag().equals("VL Building"))
        {

           distinguishVEandVL();

        }
        else if (poly.getTag().equals("MB Building"))
            setMBButtonsVisibility(true);
    }

    /**
     * Method to distinguish between VL and VE buildings
     */
    public static void distinguishVEandVL(){
        LatLng ve_location = new LatLng(45.458850, -73.638660);
        for (Polygon poly2 : polygonBuildings)
        {
            if (PolyUtil.containsLocation(ve_location, poly2.getPoints(), true))
                poly2.setVisible(false);
        }
        setVLButtonsVisibility(true);
    }

    /** Method for adding on click listeners for the explore inside button. When the button is pressed,
     * the map will zoom in on the desired building and hide the necessary polygon from view.
     * Note:
     * when you click on VL -> explore inside it hides VE since they overlap.
     * when you click on VE -> explore inside it only hides VE since the floor plan doesn't overlap with VL*/
    public static void addExploreInsideButtonListener()
    {
        exploreInsideButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // we want to remove the building outline from the map so we can see the indoor floor plan
                LatLng loc = searchMarker.getPosition();  // this is the location of the marker

                // we look at the list of all polygons. If the marker is within the polygon then we want to hide the polygon from the map.
                for (Polygon poly : polygonBuildings) {
                    if (PolyUtil.containsLocation(loc, poly.getPoints(), true))
                    {
                        getInside(poly);
                    }
                }
                // we want to zoom in onto the center of the building.
                animateCamera(loc, 19.0f);
            }
        });
    }

    /** Method for adding on click listeners for the next step button.
     *  The next step button is used when getting directions and when clicked on will show the next
     *  steps that the user has to take in their path to their destination. */
    public static void addNextStepListener()
    {
        nextStep.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (pathMarker != null)
                {
                    pathMarker.remove();
                }
                searchResultsIndex++; //increment the search result index

                if (searchResultsIndex == searchResults.size())
                {
                    if (needMoreDirections)
                    {
                        LatLng[] dest = new LatLng[searchResults.get(searchResultsIndex - 1).length];
                        System.arraycopy(searchResults.get(searchResultsIndex - 1), 0, dest, 0, searchResults.get(searchResultsIndex - 1).length);
                        origin = dest[dest.length - 1];
                        startingPoint = startingBuilding + " Building";
                        getDirections(); // call get directions again to continue getting directions
                    } else
                    {
                        // we want to reset the app back to the initial state
                        searchResultsIndex = 0;
                        searchPath.setVisible(false);
                        nextStep.setVisibility(View.INVISIBLE);
                    }
                } else if (searchResultsIndex == 0) {
                    resetPath();  //erase the path from outdoor directions
                    exploreInsideButton.performClick();
                    displaySearchResults(searchResults.get(searchResultsIndex));
                } else if (searchResultsIndex == 100) {
                    resetPath();
                    nextStep.setVisibility(View.INVISIBLE);  //we have reached the end of the search
                } else
                {
                    displaySearchResults(searchResults.get(searchResultsIndex));
                }
            }
        });
    }
}
