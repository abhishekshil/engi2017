package org.sddtu.engifest2017;

import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Bundle;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.TypedValue;
import android.view.View;

import org.sddtu.engifest2017.Adapters.SponsorAdapter;
import org.sddtu.engifest2017.DataProviders.SponsorData;

import java.util.ArrayList;

import me.anwarshahriar.calligrapher.Calligrapher;

public class SponsorsActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    ArrayList<SponsorData> arrayList = new ArrayList<SponsorData>();
    SponsorAdapter adapter;
    RecyclerView.LayoutManager layoutManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
 //       this.overridePendingTransition(R.anim.fade_in,R.anim.fade_out);
        setContentView(R.layout.activity_sponsors);

        Calligrapher calligrapher = new Calligrapher(this);
        calligrapher.setFont(this, "fonts/OpenSans-Regular.ttf", true);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        initCollapsingToolbar();


        adapter = new SponsorAdapter(SponsorsActivity.this,arrayList);
        recyclerView = (RecyclerView) findViewById(R.id.recycler_sponsors);
        layoutManager = new GridLayoutManager(this,2);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.addItemDecoration(new GridSpacingItemDecoration(2, dpToPx(15), true));
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(adapter);

        prepareAlbums();

    }

    private void initCollapsingToolbar() {
        final CollapsingToolbarLayout collapsingToolbar =
                (CollapsingToolbarLayout) findViewById(R.id.toolbar_layout);
       // collapsingToolbar.setTitle(" ");
        AppBarLayout appBarLayout = (AppBarLayout) findViewById(R.id.app_bar);
        appBarLayout.setExpanded(true);

        // hiding & showing the title when toolbar expanded & collapsed
        appBarLayout.addOnOffsetChangedListener(new AppBarLayout.OnOffsetChangedListener() {
            boolean isShow = false;
            int scrollRange = -1;

            @Override
            public void onOffsetChanged(AppBarLayout appBarLayout, int verticalOffset) {
                if (scrollRange == -1) {
                    scrollRange = appBarLayout.getTotalScrollRange();
                }
            }
        });
    }

    private void prepareAlbums() {
        int[] covers = new int[]{
                R.drawable.stryker,
                R.drawable.pepsi,
                R.drawable.logo,
                R.drawable.ntpcogo,
                R.drawable.intexlogo,
                R.drawable.redc,
                R.drawable.poker,
                R.drawable.slap,
                R.drawable.din,
                R.drawable.fc,
                R.drawable.jh,
                R.drawable.nestle,
                R.drawable.loyalcard,
                R.drawable.sbi,
                R.drawable.unk,R.drawable.ioa,R.drawable.ignite,R.drawable.loveburgin,R.drawable.paytm,R.drawable.play,
                R.drawable.bmtc,R.drawable.ddelhi,R.drawable.mankind
        };


        SponsorData a = new SponsorData("Stryker",covers[0]);
        arrayList.add(a);

        a = new SponsorData("Pepsi",covers[1]);
        arrayList.add(a);

        a = new SponsorData("Coding Ninja",covers[2]);
        arrayList.add(a);

        a = new SponsorData("NTPC",covers[3]);
        arrayList.add(a);

        a = new SponsorData("Intex",covers[4]);
        arrayList.add(a);

        a = new SponsorData("Red Carpet",covers[5]);
        arrayList.add(a);

        a = new SponsorData("PokerBaazi",covers[6]);
        arrayList.add(a);

        a = new SponsorData("#Slap",covers[7]);
        arrayList.add(a);

        a = new SponsorData("DOT In",covers[8]);
        arrayList.add(a);

        a = new SponsorData("Food Sponsor",covers[9]);
        arrayList.add(a);

        a = new SponsorData("Jawed habib",covers[10]);
        arrayList.add(a);

        a = new SponsorData("Nestle",covers[11]);
        arrayList.add(a);

        a = new SponsorData("",covers[12]);
        arrayList.add(a);

        a = new SponsorData("SBI",covers[13]);
        arrayList.add(a);

        a = new SponsorData("",covers[14]);
        arrayList.add(a);

        a = new SponsorData("",covers[15]);
        arrayList.add(a);

        a = new SponsorData("",covers[16]);
        arrayList.add(a);

        a = new SponsorData("",covers[17]);
        arrayList.add(a);

        a = new SponsorData("",covers[18]);
        arrayList.add(a);

        a = new SponsorData("",covers[19]);
        arrayList.add(a);

        a = new SponsorData("",covers[20]);
        arrayList.add(a);

        a = new SponsorData("",covers[21]);
        arrayList.add(a);

        a = new SponsorData("",covers[22]);
        arrayList.add(a);

        adapter.notifyDataSetChanged();
    }

    public class GridSpacingItemDecoration extends RecyclerView.ItemDecoration {

        private int spanCount;
        private int spacing;
        private boolean includeEdge;

        public GridSpacingItemDecoration(int spanCount, int spacing, boolean includeEdge) {
            this.spanCount = spanCount;
            this.spacing = spacing;
            this.includeEdge = includeEdge;
        }

        @Override
        public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
            int position = parent.getChildAdapterPosition(view); // item position
            int column = position % spanCount; // item column

            if (includeEdge) {
                outRect.left = spacing - column * spacing / spanCount; // spacing - column * ((1f / spanCount) * spacing)
                outRect.right = (column + 1) * spacing / spanCount; // (column + 1) * ((1f / spanCount) * spacing)

                if (position < spanCount) { // top edge
                    outRect.top = spacing;
                }
                outRect.bottom = spacing; // item bottom
            } else {
                outRect.left = column * spacing / spanCount; // column * ((1f / spanCount) * spacing)
                outRect.right = spacing - (column + 1) * spacing / spanCount; // spacing - (column + 1) * ((1f /    spanCount) * spacing)
                if (position >= spanCount) {
                    outRect.top = spacing; // item top
                }
            }
        }
    }

    /**
     * Converting dp to pixel
     */
    private int dpToPx(int dp) {
        Resources r = getResources();
        return Math.round(TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dp, r.getDisplayMetrics()));
    }

}
