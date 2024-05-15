var labelType, useGradients, nativeTextSupport, animate;

(function () {
    var ua = navigator.userAgent,
        iStuff = ua.match(/iPhone/i) || ua.match(/iPad/i),
        typeOfCanvas = typeof HTMLCanvasElement,
        nativeCanvasSupport = (typeOfCanvas == 'object' || typeOfCanvas == 'function'),
        textSupport = nativeCanvasSupport
            && (typeof document.createElement('canvas').getContext('2d').fillText == 'function');
    //I'm setting this based on the fact that ExCanvas provides text support for IE
    //and that as of today iPhone/iPad current text support is lame
    labelType = (!nativeCanvasSupport || (textSupport && !iStuff)) ? 'Native' : 'HTML';
    nativeTextSupport = labelType == 'Native';
    useGradients = nativeCanvasSupport;
    animate = !(iStuff || !nativeCanvasSupport);
})();

var Log = {
    elem: false,
    write: function (text) {
        if (!this.elem)
            this.elem = document.getElementById('log');
        this.elem.innerHTML = text;
        this.elem.style.left = (500 - this.elem.offsetWidth / 2) + 'px';
    }
};


function init() {
    //init data
    var json = {
        id: "node02",
        name: "Cidades",
        data: {},
        children: [{
            id: "node13",
            name: "Londrina",
            data: {},
            children: [{
                id: "node24",
                name: "2015",
                data: {},
                children: [{
                    id: "node35",
                    name: "5.27",
                    data: {},
                },
                ]
            },

            {
                id: "node25",
                name: "2016",
                data: {},
                children: [{
                    id: "node36",
                    name: "2.24",
                    data: {},
                },
                ]

            },

            {
                id: "node26",
                name: "2017",
                data: {},
                children: [{
                    id: "node37",
                    name: "1.19",
                    data: {},
                },
                ]

            },
            {
                id: "node27",
                name: "2018",
                data: {},
                children: [{
                    id: "node38",
                    name: "3.70",
                    data: {},
                },
                ]

            },
            {
                id: "node28",
                name: "Média",
                data: {},
                children: [{
                    id: "node39",
                    name: "5.54",
                    data: {},
                },
                ]

            }]

        },





        {
            id: "node125",
            name: "Curitiba",
            data: {},
            children: [{
                id: "node226",
                name: "2015",
                data: {},
                children: [{
                    id: "node327",
                    name: "3.27",
                    data: {},

                }]
            }, {
                id: "node237",
                name: "2016",
                data: {},
                children: [{
                    id: "node338",
                    name: "4.80",
                    data: {},


                }]
            },
            {
                id: "node238",
                name: "2017",
                data: {},
                children: [{
                    id: "node339",
                    name: "1.08",
                    data: {},


                }]
            },
            {
                id: "node239",
                name: "2018",
                data: {},
                children: [{
                    id: "node340",
                    name: "2.18",
                    data: {},


                }]
            },

            {
                id: "node240",
                name: "Média",
                data: {},
                children: [{
                    id: "node341",
                    name: "4.59",
                    data: {},

                }]
            }]

        },

        {
            id: "node1130",
            name: "Campo Mourao",
            data: {},
            children: [{
                id: "node2131",
                name: "2015",
                data: {},
                children: [{
                    id: "node3132",
                    name: "7,42",
                    data: {},
                }]
            }, {
                id: "node2138",
                name: "2016",
                data: {},
                children: [{
                    id: "node3139",
                    name: "3,47",
                    data: {},
                }]

            },
            {
                id: "node2139",
                name: "Média",
                data: {},
                children: [{
                    id: "node3140",
                    name: "6,55",
                    data: {},
                }]
            }]
        },

        {
            id: "node125",
            name: "Curitiba",
            data: {},
            children: [{
                id: "node226",
                name: "2015",
                data: {},
                children: [{
                    id: "node327",
                    name: "3.27",
                    data: {},

                }]
            }, {
                id: "node237",
                name: "2016",
                data: {},
                children: [{
                    id: "node338",
                    name: "4.80",
                    data: {},


                }]
            },
            {
                id: "node238",
                name: "2017",
                data: {},
                children: [{
                    id: "node339",
                    name: "1.08",
                    data: {},


                }]
            },
            {
                id: "node239",
                name: "2018",
                data: {},
                children: [{
                    id: "node340",
                    name: "2.18",
                    data: {},


                }]
            },

            {
                id: "node240",
                name: "Média",
                data: {},
                children: [{
                    id: "node341",
                    name: "4.59",
                    data: {},

                }]
            }]

        },

        {
            id: "node1200",
            name: "Castro",
            data: {},
            children: [{
                id: "node2268",
                name: "2015",
                data: {},
                children: [{
                    id: "node3270",
                    name: "4,60",
                    data: {},

                }]
            }, {
                id: "node2373",
                name: "2016",
                data: {},
                children: [{
                    id: "node3381",
                    name: "3,61",
                    data: {},


                }]
            },
            {
                id: "node2384",
                name: "2017",
                data: {},
                children: [{
                    id: "node3391",
                    name: "0,02",
                    data: {},


                }]
            },
            {
                id: "node2394",
                name: "2018",
                data: {},
                children: [{
                    id: "node3401",
                    name: "1,35",
                    data: {},


                }]
            },

            {
                id: "node2401",
                name: "Média",
                data: {},
                children: [{
                    id: "node3421",
                    name: "4.55",
                    data: {},

                }]
            }]

        }]

    };
    //end
    //init Spacetree
    //Create a new ST instance
    var st = new $jit.ST({
        //id of viz container element
        injectInto: 'infovis',
        //set duration for the animation
        duration: 800,
        //set animation transition type
        transition: $jit.Trans.Quart.easeInOut,
        //set distance between node and its children
        levelDistance: 50,
        //enable panning
        Navigation: {
            enable: true,
            panning: true
        },
        //set node and edge styles
        //set overridable=true for styling individual
        //nodes or edges
        Node: {
            height: 20,
            width: 60,
            type: 'rectangle',
            color: '#aaa',
            overridable: true
        },

        Edge: {
            type: 'bezier',
            overridable: true
        },

        onBeforeCompute: function (node) {
            Log.write("loading " + node.name);
        },

        onAfterCompute: function () {
            Log.write("done");
        },

        //This method is called on DOM label creation.
        //Use this method to add event handlers and styles to
        //your node.
        onCreateLabel: function (label, node) {
            label.id = node.id;
            label.innerHTML = node.name;
            label.onclick = function () {
                if (normal.checked) {
                    st.onClick(node.id);
                } else {
                    st.setRoot(node.id, 'animate');
                }
            };
            //set label styles
            var style = label.style;
            style.width = 60 + 'px';
            style.height = 17 + 'px';
            style.cursor = 'pointer';
            style.color = '#333';
            style.fontSize = '0.8em';
            style.textAlign = 'center';
            style.paddingTop = '3px';
        },

        //This method is called right before plotting
        //a node. It's useful for changing an individual node
        //style properties before plotting it.
        //The data properties prefixed with a dollar
        //sign will override the global node style properties.
        onBeforePlotNode: function (node) {
            //add some color to the nodes in the path between the
            //root node and the selected node.
            if (node.selected) {
                node.data.$color = "#ff7";
            }
            else {
                delete node.data.$color;
                //if the node belongs to the last plotted level
                if (!node.anySubnode("exist")) {
                    //count children number
                    var count = 0;
                    node.eachSubnode(function (n) { count++; });
                    //assign a node color based on
                    //how many children it has
                    node.data.$color = ['#aaa', '#baa', '#caa', '#daa', '#eaa', '#faa'][count];
                }
            }
        },

        //This method is called right before plotting
        //an edge. It's useful for changing an individual edge
        //style properties before plotting it.
        //Edge data proprties prefixed with a dollar sign will
        //override the Edge global style properties.
        onBeforePlotLine: function (adj) {
            if (adj.nodeFrom.selected && adj.nodeTo.selected) {
                adj.data.$color = "#eed";
                adj.data.$lineWidth = 3;
            }
            else {
                delete adj.data.$color;
                delete adj.data.$lineWidth;
            }
        }
    });
    //load json data
    st.loadJSON(json);
    //compute node positions and layout
    st.compute();
    //optional: make a translation of the tree
    st.geom.translate(new $jit.Complex(-200, 0), "current");
    //emulate a click on the root node.
    st.onClick(st.root);
    //end
    //Add event handlers to switch spacetree orientation.
    var top = $jit.id('r-top'),
        left = $jit.id('r-left'),
        bottom = $jit.id('r-bottom'),
        right = $jit.id('r-right'),
        normal = $jit.id('s-normal');


    function changeHandler() {
        if (this.checked) {
            top.disabled = bottom.disabled = right.disabled = left.disabled = true;
            st.switchPosition(this.value, "animate", {
                onComplete: function () {
                    top.disabled = bottom.disabled = right.disabled = left.disabled = false;
                }
            });
        }
    };

    top.onchange = left.onchange = bottom.onchange = right.onchange = changeHandler;
    //end

}
