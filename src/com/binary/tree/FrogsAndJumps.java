package com.binary.tree;

import java.util.Arrays;

public class FrogsAndJumps {

    public static int unvisitedLeaves(int N, int leaves, int frogs[]) {
        // vCode here
        int[] arr = new int[leaves];
        // int steps=0;
        int pos=0;
        int left_leaves=leaves;
        while(N>0){
            while(pos<leaves){
                pos+=frogs[N-1];
                if(pos<=leaves)
                    if(arr[pos-1]!=1){
                        left_leaves--;
                        arr[pos-1]=1;
                    }
            }
            if(left_leaves==0){
                break;
            }
            pos=0;
            N--;
        }
        System.out.println(left_leaves);
        return left_leaves;
       /* int size=leaves+1;
        int[] visited=new int[size];
        Arrays.fill(visited,0);
        Arrays.sort(frogs);
        for(int i=0;i<N;i++){
            if(frogs[i]<=leaves && visited[frogs[i]]==0){
                int j=frogs[i];
                while(j<=leaves){
                    if(visited[j]!=1){
                        visited[j]=1;
                        size--;
                    }
                    j+=frogs[i];
                }
            }
            if(size==1){
                break;
            }
        }
        System.out.println(size-1);
        return size-1;*/

    }

    public static void main(String[] args){
        int[] frogs = {3,2,4};
        int leaves = 4;
        int N = 3;
        unvisitedLeaves(N,leaves,frogs);

    }
}
