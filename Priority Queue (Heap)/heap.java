// heap or priority queue implementation

// PriorityQueue<Integer> pq=new PriorityQueue<>();     min heap
// PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());     max heap

import java.util.ArrayList;

public class heap {
    ArrayList<Integer> data=new ArrayList<>();
    public void add(int x)
    {
        this.data.add(x);
        upheapify(this.data.size()-1);
    }
    private void upheapify(int ci) {

        int pi=(ci-1)/2;
        if(this.data.get(pi)>this.data.get(ci))
        {
            swap(ci,pi);
            upheapify(pi);
        }
    }
    private void swap(int i, int j) {
        int ith=this.data.get(i);
        int jth=this.data.get(j);
        this.data.set(i,jth);
        this.data.set(j,ith);
    }
    public int remove()
    {
        swap(0, this.data.size()-1);
        int ans=this.data.remove(this.data.size()-1);
        downheapify(0);
        return ans;
    }
    private void downheapify(int pi) {

        int rci=2*pi+2;
        int lci=2*pi+1;
        int mini=pi;
        if(lci<this.data.size() && this.data.get(lci)<this.data.get(mini))
        {
            mini=lci;
        }
        if(rci<this.data.size() && this.data.get(rci)<this.data.get(mini))
        {
            mini=rci;
        }
        if(mini!=pi)
        {
            swap(pi, mini);
            downheapify(mini);
        }

    }
    public int getmin()
    {
        return this.data.get(0);
    }
    public int size()
    {
        return this.data.size();
    }
    public void display() {
		System.out.println(this.data);
	}
} 
