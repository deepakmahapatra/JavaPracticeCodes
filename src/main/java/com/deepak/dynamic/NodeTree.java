package com.deepak.dynamic;

import javax.xml.soap.Node;

class NodeTree {
    int key;
    int height;
    NodeTree left, right;

    public NodeTree(int item) {
        key = item;
        left = right = null;
        height=1;
    }
}