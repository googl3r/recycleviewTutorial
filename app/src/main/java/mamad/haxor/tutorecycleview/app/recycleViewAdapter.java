package mamad.haxor.tutorecycleview.app;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by mamadhaxor on 22/01/15.
 */
public class recycleViewAdapter extends RecyclerView.Adapter<recycleViewAdapter.ViewHolder>
{
    private ItemsModelList data;
    recycleViewAdapter(ItemsModelList data)
    {
        this.data = data;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.cardview_row, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, final int i) {
        ItemsModel itemsModel = data.getItem(i);
        viewHolder.firstText.setText(itemsModel.getFirstText());
        Bitmap bitmap = BitmapFactory.decodeResource(viewHolder.view.getResources(), itemsModel.getImage());
        viewHolder.imageView.setImageBitmap(bitmap);
        viewHolder.secondText.setText(itemsModel.getSecondText());
        viewHolder.details.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*
                Bundle bundle = new Bundle();
                bundle.putSerializable("data", data);
                bundle.putInt("pos", i);
                Intent intent = new Intent(viewHolder.view.getContext(), DetailActivity.class);
                intent.putExtras(bundle);
                viewHolder.view.getContext().startActivity(intent);
                */
                Log.i("Clicked on item", "just clicked on item "+ i);
            }
        });
    }

    @Override
    public int getItemCount() {
        return data.getItemCount();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder
    {
        public TextView firstText;
        public ImageView imageView;
        public TextView secondText;
        public Button details;
        public Button share;
        public View view;

        public ViewHolder(View itemView) {
            super(itemView);
            this.view = itemView;
            details = (Button)view.findViewById(R.id.details);
            share = (Button)view.findViewById(R.id.partager);
            firstText = (TextView)view.findViewById(R.id.firstText);
            imageView = (ImageView)view.findViewById(R.id.image);
            secondText = (TextView)view.findViewById(R.id.secondText);
        }
    }
}
