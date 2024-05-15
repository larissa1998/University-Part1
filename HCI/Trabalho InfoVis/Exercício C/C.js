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
        'id': 'root',
        'name': 'Cidades',
        'data': {
            //'$type': 'none'
        },
        'children': [
            {
                'id': 'pie10',
                'name': 'Londrina',
                'data': {
                    '$angularWidth': 20,
                    '$color': '#f55'
                },
                'children': [
                    {
                        'id': 'pie100',
                        'name': '2015',
                        'data': {
                            '$angularWidth': 20,
                            '$color': '#55f'
                        },
                        'children': [
                            {
                                'id': 'pie400',
                                'name': '01/01',
                                'data': {
                                    '$angularWidth': 40,
                                    '$color': '#88f'
                                },
                                'children': [
                                    {
                                        'id': 'pie410',
                                        'name': '15.8',
                                        'data': {
                                            '$angularWidth': 40,
                                            '$color': '#88f'
                                        },
                                        'children': []


                                    }]


                            },
                            {
                                'id': 'pie250',
                                'name': '04/03',
                                'data': {
                                    '$angularWidth': 60,
                                    '$color': '#99f'
                                },
                                'children': [
                                    {
                                        'id': 'pie411',
                                        'name': '0',
                                        'data': {
                                            '$angularWidth': 40,
                                            '$color': '#88f'
                                        },
                                        'children': []


                                    }]

                            },
                            {

                                'id': 'pie255',
                                'name': '04/05',
                                'data': {
                                    '$angularWidth': 60,
                                    '$color': '#99f'
                                },
                                'children': [
                                    {
                                        'id': 'pie412',
                                        'name': '10.8',
                                        'data': {
                                            '$angularWidth': 40,
                                            '$color': '#88f'
                                        },
                                        'children': []


                                    }]


                            },
                            {

                                'id': 'pie256',
                                'name': '04/21',
                                'data': {
                                    '$angularWidth': 60,
                                    '$color': '#99f'
                                },
                                'children': [
                                    {
                                        'id': 'pie413',
                                        'name': '0',
                                        'data': {
                                            '$angularWidth': 40,
                                            '$color': '#88f'
                                        },
                                        'children': []


                                    }]


                            },
                            {

                                'id': 'pie257',
                                'name': '05/01',
                                'data': {
                                    '$angularWidth': 60,
                                    '$color': '#99f'
                                },
                                'children': [
                                    {
                                        'id': 'pie414',
                                        'name': '0',
                                        'data': {
                                            '$angularWidth': 40,
                                            '$color': '#88f'
                                        },
                                        'children': []


                                    }]
                            },
                            {

                                'id': 'pie258',
                                'name': '06/04',
                                'data': {
                                    '$angularWidth': 60,
                                    '$color': '#99f'
                                },
                                'children': [
                                    {
                                        'id': 'pie415',
                                        'name': '0',
                                        'data': {
                                            '$angularWidth': 40,
                                            '$color': '#88f'
                                        },
                                        'children': []


                                    }]
                            },
                            {

                                'id': 'pie259',
                                'name': '09/07',
                                'data': {
                                    '$angularWidth': 60,
                                    '$color': '#99f'
                                },
                                'children': [
                                    {
                                        'id': 'pie416',
                                        'name': '2.4',
                                        'data': {
                                            '$angularWidth': 40,
                                            '$color': '#88f'
                                        },
                                        'children': []


                                    }]
                            },
                            {

                                'id': 'pie260',
                                'name': '10/12',
                                'data': {
                                    '$angularWidth': 60,
                                    '$color': '#99f'
                                },
                                'children': [
                                    {
                                        'id': 'pie420',
                                        'name': '33.8',
                                        'data': {
                                            '$angularWidth': 40,
                                            '$color': '#88f'
                                        },
                                        'children': []


                                    }]
                            },
                            {

                                'id': 'pie261',
                                'name': '11/02',
                                'data': {
                                    '$angularWidth': 60,
                                    '$color': '#99f'
                                },
                                'children': [
                                    {
                                        'id': 'pie430',
                                        'name': '2',
                                        'data': {
                                            '$angularWidth': 40,
                                            '$color': '#88f'
                                        },
                                        'children': []


                                    }]
                            },
                            {

                                'id': 'pie262',
                                'name': '11/15',
                                'data': {
                                    '$angularWidth': 60,
                                    '$color': '#99f'
                                },
                                'children': [
                                    {
                                        'id': 'pie425',
                                        'name': '15.2',
                                        'data': {
                                            '$angularWidth': 40,
                                            '$color': '#88f'
                                        },
                                        'children': []


                                    }]
                            },
                            {

                                'id': 'pie263',
                                'name': '12/25',
                                'data': {
                                    '$angularWidth': 60,
                                    '$color': '#99f'
                                },
                                'children': [
                                    {
                                        'id': 'pie426',
                                        'name': '34.2',
                                        'data': {
                                            '$angularWidth': 40,
                                            '$color': '#88f'
                                        },
                                        'children': []


                                    }]
                            }


                        ]

                    },
                    {
                        'id': 'pie101',
                        'name': '2016',
                        'data': {
                            '$angularWidth': 70,
                            '$color': '#66f'
                        },
                        'children': [
                            {
                                'id': 'pie470',
                                'name': '01/01',
                                'data': {
                                    '$angularWidth': 40,
                                    '$color': '#88f'
                                },
                                'children': [
                                    {
                                        'id': 'pie471',
                                        'name': '11.2',
                                        'data': {
                                            '$angularWidth': 40,
                                            '$color': '#88f'
                                        },
                                        'children': []


                                    }]


                            },
                            {
                                'id': 'pie472',
                                'name': '03/25',
                                'data': {
                                    '$angularWidth': 40,
                                    '$color': '#88f'
                                },
                                'children': [
                                    {
                                        'id': 'pie473',
                                        'name': '24',
                                        'data': {
                                            '$angularWidth': 40,
                                            '$color': '#88f'
                                        },
                                        'children': []


                                    }]
                            },
                            {
                                'id': 'pie475',
                                'name': '03/27',
                                'data': {
                                    '$angularWidth': 40,
                                    '$color': '#88f'
                                },
                                'children': [
                                    {
                                        'id': 'pie476',
                                        'name': '0',
                                        'data': {
                                            '$angularWidth': 40,
                                            '$color': '#88f'
                                        },
                                        'children': []


                                    }]
                            },
                            {
                                'id': 'pie478',
                                'name': '04/21',
                                'data': {
                                    '$angularWidth': 40,
                                    '$color': '#88f'
                                },
                                'children': [
                                    {
                                        'id': 'pie479',
                                        'name': '0',
                                        'data': {
                                            '$angularWidth': 40,
                                            '$color': '#88f'
                                        },
                                        'children': []


                                    }]
                            },
                            {
                                'id': 'pie480',
                                'name': '05/01',
                                'data': {
                                    '$angularWidth': 40,
                                    '$color': '#88f'
                                },
                                'children': [
                                    {
                                        'id': 'pie481',
                                        'name': '0',
                                        'data': {
                                            '$angularWidth': 40,
                                            '$color': '#88f'
                                        },
                                        'children': []


                                    }]
                            },
                            {
                                'id': 'pie482',
                                'name': '05/26',
                                'data': {
                                    '$angularWidth': 40,
                                    '$color': '#88f'
                                },
                                'children': [
                                    {
                                        'id': 'pie483',
                                        'name': '0',
                                        'data': {
                                            '$angularWidth': 40,
                                            '$color': '#88f'
                                        },
                                        'children': []


                                    }]
                            },
                            {
                                'id': 'pie484',
                                'name': '09/07',
                                'data': {
                                    '$angularWidth': 40,
                                    '$color': '#88f'
                                },
                                'children': [
                                    {
                                        'id': 'pie485',
                                        'name': '0',
                                        'data': {
                                            '$angularWidth': 40,
                                            '$color': '#88f'
                                        },
                                        'children': []


                                    }]
                            },
                            {
                                'id': 'pie486',
                                'name': '11/02',
                                'data': {
                                    '$angularWidth': 40,
                                    '$color': '#88f'
                                },
                                'children': [
                                    {
                                        'id': 'pie487',
                                        'name': '0',
                                        'data': {
                                            '$angularWidth': 40,
                                            '$color': '#88f'
                                        },
                                        'children': []


                                    }]
                            },
                            {
                                'id': 'pie488',
                                'name': '11/15',
                                'data': {
                                    '$angularWidth': 40,
                                    '$color': '#88f'
                                },
                                'children': [
                                    {
                                        'id': 'pie489',
                                        'name': '0',
                                        'data': {
                                            '$angularWidth': 40,
                                            '$color': '#88f'
                                        },
                                        'children': []


                                    }]
                            },
                            {
                                'id': 'pie490',
                                'name': '12/25',
                                'data': {
                                    '$angularWidth': 40,
                                    '$color': '#88f'
                                },
                                'children': [
                                    {
                                        'id': 'pie491',
                                        'name': '0',
                                        'data': {
                                            '$angularWidth': 40,
                                            '$color': '#88f'
                                        },
                                        'children': []


                                    }]
                            }]

                    },
                    {
                        'id': 'pie102',
                        'name': '2017',
                        'data': {
                            '$angularWidth': 10,
                            '$color': '#77f'
                        },
                        'children': [
                            {
                                'id': 'pie800',
                                'name': '01/01',
                                'data': {
                                    '$angularWidth': 40,
                                    '$color': '#88f'
                                },
                                'children': [
                                    {
                                        'id': 'pie801',
                                        'name': '41.2',
                                        'data': {
                                            '$angularWidth': 40,
                                            '$color': '#88f'
                                        },
                                        'children': []


                                    }]

                            },
                            {
                                'id': 'pie888',
                                'name': '04/14',
                                'data': {
                                    '$angularWidth': 40,
                                    '$color': '#88f'
                                },
                                'children': [
                                    {
                                        'id': 'pie889',
                                        'name': '0',
                                        'data': {
                                            '$angularWidth': 40,
                                            '$color': '#88f'
                                        },
                                        'children': []


                                    }]
                            },
                            {
                                'id': 'pie777',
                                'name': '04/16',
                                'data': {
                                    '$angularWidth': 40,
                                    '$color': '#88f'
                                },
                                'children': [
                                    {
                                        'id': 'pie7778',
                                        'name': '0',
                                        'data': {
                                            '$angularWidth': 40,
                                            '$color': '#88f'
                                        },
                                        'children': []


                                    }]
                            },
                            {
                                'id': 'pie8989',
                                'name': '04/21',
                                'data': {
                                    '$angularWidth': 40,
                                    '$color': '#88f'
                                },
                                'children': [
                                    {
                                        'id': 'pie4915',
                                        'name': '47.4',
                                        'data': {
                                            '$angularWidth': 40,
                                            '$color': '#88f'
                                        },
                                        'children': []


                                    }]
                            },
                            {
                                'id': 'pie1519',
                                'name': '05/01',
                                'data': {
                                    '$angularWidth': 40,
                                    '$color': '#88f'
                                },
                                'children': [
                                    {
                                        'id': 'pie49177',
                                        'name': '0',
                                        'data': {
                                            '$angularWidth': 40,
                                            '$color': '#88f'
                                        },
                                        'children': []


                                    }]
                            },
                            {
                                'id': 'pie998',
                                'name': '06/15',
                                'data': {
                                    '$angularWidth': 40,
                                    '$color': '#88f'
                                },
                                'children': [
                                    {
                                        'id': 'pie988',
                                        'name': '0',
                                        'data': {
                                            '$angularWidth': 40,
                                            '$color': '#88f'
                                        },
                                        'children': []


                                    }]
                            },
                            {
                                'id': 'pie1587',
                                'name': '09/07',
                                'data': {
                                    '$angularWidth': 40,
                                    '$color': '#88f'
                                },
                                'children': [
                                    {
                                        'id': 'pie1818',
                                        'name': '0',
                                        'data': {
                                            '$angularWidth': 40,
                                            '$color': '#88f'
                                        },
                                        'children': []


                                    }]
                            },
                            {
                                'id': 'pie9879',
                                'name': '10/12',
                                'data': {
                                    '$angularWidth': 40,
                                    '$color': '#88f'
                                },
                                'children': [
                                    {
                                        'id': 'pie1879',
                                        'name': '3.2',
                                        'data': {
                                            '$angularWidth': 40,
                                            '$color': '#88f'
                                        },
                                        'children': []


                                    }]
                            },
                            {
                                'id': 'pie1018',
                                'name': '11/02',
                                'data': {
                                    '$angularWidth': 40,
                                    '$color': '#88f'
                                },
                                'children': [
                                    {
                                        'id': 'pie52872',
                                        'name': '0',
                                        'data': {
                                            '$angularWidth': 40,
                                            '$color': '#88f'
                                        },
                                        'children': []


                                    }]
                            },
                            {
                                'id': 'pie9894',
                                'name': '11/15',
                                'data': {
                                    '$angularWidth': 40,
                                    '$color': '#88f'
                                },
                                'children': [
                                    {
                                        'id': 'pie7984',
                                        'name': '0',
                                        'data': {
                                            '$angularWidth': 40,
                                            '$color': '#88f'
                                        },
                                        'children': []


                                    }]
                            },
                            {
                                'id': 'pie85858',
                                'name': '12/25',
                                'data': {
                                    '$angularWidth': 40,
                                    '$color': '#88f'
                                },
                                'children': [
                                    {
                                        'id': 'pie15875',
                                        'name': '25.2',
                                        'data': {
                                            '$angularWidth': 40,
                                            '$color': '#88f'
                                        },
                                        'children': []


                                    }]
                            }]
                    },
                    {
                        'id': 'pie103',
                        'name': '2018',
                        'data': {
                            '$angularWidth': 10,
                            '$color': '#77f'
                        },
                        'children': [
                            {
                                'id': 'pie104',
                                'name': '01/01',
                                'data': {
                                    '$angularWidth': 40,
                                    '$color': '#88f'
                                },
                                'children': [
                                    {
                                        'id': 'pie105',
                                        'name': '1.8',
                                        'data': {
                                            '$angularWidth': 40,
                                            '$color': '#88f'
                                        },
                                        'children': []


                                    }]


                            },
                            {
                                'id': 'pie15987',
                                'name': '03/30',
                                'data': {
                                    '$angularWidth': 40,
                                    '$color': '#88f'
                                },
                                'children': [
                                    {
                                        'id': 'pie14789',
                                        'name': '0',
                                        'data': {
                                            '$angularWidth': 40,
                                            '$color': '#88f'
                                        },
                                        'children': []


                                    }]
                            },


                            {
                                'id': 'pie8981',
                                'name': '04/01',
                                'data': {
                                    '$angularWidth': 40,
                                    '$color': '#88f'
                                },
                                'children': [
                                    {
                                        'id': 'pie79777',
                                        'name': '2.4',
                                        'data': {
                                            '$angularWidth': 40,
                                            '$color': '#88f'
                                        },
                                        'children': []


                                    }]
                            },
                            {
                                'id': 'pie8717',
                                'name': '04/21',
                                'data': {
                                    '$angularWidth': 40,
                                    '$color': '#88f'
                                },
                                'children': [
                                    {
                                        'id': 'pie7114',
                                        'name': '0',
                                        'data': {
                                            '$angularWidth': 40,
                                            '$color': '#88f'
                                        },
                                        'children': []


                                    }]
                            }, {
                                'id': 'pie8955',
                                'name': '05/01',
                                'data': {
                                    '$angularWidth': 40,
                                    '$color': '#88f'
                                },
                                'children': [
                                    {
                                        'id': 'pie79811',
                                        'name': '0',
                                        'data': {
                                            '$angularWidth': 40,
                                            '$color': '#88f'
                                        },
                                        'children': []


                                    }]
                            },
                            {
                                'id': 'pie8771',
                                'name': '05/31',
                                'data': {
                                    '$angularWidth': 40,
                                    '$color': '#88f'
                                },
                                'children': [
                                    {
                                        'id': 'pie7924',
                                        'name': '0',
                                        'data': {
                                            '$angularWidth': 40,
                                            '$color': '#88f'
                                        },
                                        'children': []


                                    }]
                            },
                            {
                                'id': 'pie8951',
                                'name': '09/07',
                                'data': {
                                    '$angularWidth': 40,
                                    '$color': '#88f'
                                },
                                'children': [
                                    {
                                        'id': 'pie7998',
                                        'name': '0',
                                        'data': {
                                            '$angularWidth': 40,
                                            '$color': '#88f'
                                        },
                                        'children': []


                                    }]
                            },
                            {
                                'id': 'pie865',
                                'name': '10/12',
                                'data': {
                                    '$angularWidth': 40,
                                    '$color': '#88f'
                                },
                                'children': [
                                    {
                                        'id': 'pie79878',
                                        'name': '0',
                                        'data': {
                                            '$angularWidth': 40,
                                            '$color': '#88f'
                                        },
                                        'children': []


                                    }]
                            },
                            {
                                'id': 'pie14953',
                                'name': '11/02',
                                'data': {
                                    '$angularWidth': 40,
                                    '$color': '#88f'
                                },
                                'children': [
                                    {
                                        'id': 'pie1985',
                                        'name': '15.4',
                                        'data': {
                                            '$angularWidth': 40,
                                            '$color': '#88f'
                                        },
                                        'children': []


                                    }]
                            },
                            {
                                'id': 'pie1875',
                                'name': '11/15',
                                'data': {
                                    '$angularWidth': 40,
                                    '$color': '#88f'
                                },
                                'children': [
                                    {
                                        'id': 'pie1365',
                                        'name': '1',
                                        'data': {
                                            '$angularWidth': 40,
                                            '$color': '#88f'
                                        },
                                        'children': []


                                    }]
                            },
                            {
                                'id': 'pie4528',
                                'name': '12/25',
                                'data': {
                                    '$angularWidth': 40,
                                    '$color': '#88f'
                                },
                                'children': [
                                    {
                                        'id': 'pie7777',
                                        'name': '4.4',
                                        'data': {
                                            '$angularWidth': 40,
                                            '$color': '#88f'
                                        },
                                        'children': []


                                    }]
                            }]
                    }]

            },
            {
                'id': 'pie20',
                'name': 'Curitiba',
                'data': {
                    '$angularWidth': 40,
                    '$color': '#f77'
                },
                'children': [
                    {
                        'id': 'pie200',
                        'name': '2015',
                        'data': {
                            '$angularWidth': 40,
                            '$color': '#88f'
                        },
                        'children': [
                            {
                                'id': 'pie1234',
                                'name': '01/01',
                                'data': {
                                    '$angularWidth': 40,
                                    '$color': '#88f'
                                },
                                'children': [
                                    {
                                        'id': 'pie4132',
                                        'name': '0.2',
                                        'data': {
                                            '$angularWidth': 40,
                                            '$color': '#88f'
                                        },
                                        'children': []


                                    }]


                            },
                            {
                                'id': 'pie1235',
                                'name': '04/03',
                                'data': {
                                    '$angularWidth': 40,
                                    '$color': '#88f'
                                },
                                'children': [
                                    {
                                        'id': 'pie4135',
                                        'name': '0',
                                        'data': {
                                            '$angularWidth': 40,
                                            '$color': '#88f'
                                        },
                                        'children': []


                                    }]
                            },
                            {
                                'id': 'pie1304',
                                'name': '04/05',
                                'data': {
                                    '$angularWidth': 40,
                                    '$color': '#88f'
                                },
                                'children': [
                                    {
                                        'id': 'pie4012',
                                        'name': '0.2',
                                        'data': {
                                            '$angularWidth': 40,
                                            '$color': '#88f'
                                        },
                                        'children': []


                                    }]
                            },

                            {
                                'id': 'pie025',
                                'name': '04/21',
                                'data': {
                                    '$angularWidth': 40,
                                    '$color': '#88f'
                                },
                                'children': [
                                    {
                                        'id': 'pie058',
                                        'name': '7.1',
                                        'data': {
                                            '$angularWidth': 40,
                                            '$color': '#88f'
                                        },
                                        'children': []


                                    }]
                            },
                            {
                                'id': 'pie0589',
                                'name': '05/01',
                                'data': {
                                    '$angularWidth': 40,
                                    '$color': '#88f'
                                },
                                'children': [
                                    {
                                        'id': 'pie25887',
                                        'name': '0',
                                        'data': {
                                            '$angularWidth': 40,
                                            '$color': '#88f'
                                        },
                                        'children': []


                                    }]
                            },
                            {
                                'id': 'pie0589',
                                'name': '06/04',
                                'data': {
                                    '$angularWidth': 40,
                                    '$color': '#88f'
                                },
                                'children': [
                                    {
                                        'id': 'pie0001',
                                        'name': '0',
                                        'data': {
                                            '$angularWidth': 40,
                                            '$color': '#88f'
                                        },
                                        'children': []


                                    }]
                            },
                            {
                                'id': 'pie12340',
                                'name': '09/07',
                                'data': {
                                    '$angularWidth': 40,
                                    '$color': '#88f'
                                },
                                'children': [
                                    {
                                        'id': 'pie41320',
                                        'name': '0.3',
                                        'data': {
                                            '$angularWidth': 40,
                                            '$color': '#88f'
                                        },
                                        'children': []


                                    }]
                            },
                            {
                                'id': 'pie12341',
                                'name': '10/12',
                                'data': {
                                    '$angularWidth': 40,
                                    '$color': '#88f'
                                },
                                'children': [
                                    {
                                        'id': 'pie41321',
                                        'name': '26.3',
                                        'data': {
                                            '$angularWidth': 40,
                                            '$color': '#88f'
                                        },
                                        'children': []


                                    }]
                            },
                            {
                                'id': 'pie12342',
                                'name': '11/02',
                                'data': {
                                    '$angularWidth': 40,
                                    '$color': '#88f'
                                },
                                'children': [
                                    {
                                        'id': 'pie41322',
                                        'name': '1.8',
                                        'data': {
                                            '$angularWidth': 40,
                                            '$color': '#88f'
                                        },
                                        'children': []


                                    }]
                            },
                            {
                                'id': 'pie12344',
                                'name': '11/15',
                                'data': {
                                    '$angularWidth': 40,
                                    '$color': '#88f'
                                },
                                'children': [
                                    {
                                        'id': 'pie41324',
                                        'name': '0.5',
                                        'data': {
                                            '$angularWidth': 40,
                                            '$color': '#88f'
                                        },
                                        'children': []


                                    }]
                            },
                            {
                                'id': 'pie1222',
                                'name': '12/25',
                                'data': {
                                    '$angularWidth': 40,
                                    '$color': '#88f'
                                },
                                'children': [
                                    {
                                        'id': 'pie41312',
                                        'name': '0',
                                        'data': {
                                            '$angularWidth': 40,
                                            '$color': '#88f'
                                        },
                                        'children': []


                                    }]
                            }]

                    },
                    {
                        'id': 'pie201',
                        'name': '2016',
                        'data': {
                            '$angularWidth': 60,
                            '$color': '#99f'
                        },
                        'children': [
                            {
                                'id': 'pie125484',
                                'name': '01/01',
                                'data': {
                                    '$angularWidth': 40,
                                    '$color': '#88f'
                                },
                                'children': [
                                    {
                                        'id': 'pie45455',
                                        'name': '0.4',
                                        'data': {
                                            '$angularWidth': 40,
                                            '$color': '#88f'
                                        },
                                        'children': []


                                    }]


                            },
                            {
                                'id': 'pie1021',
                                'name': '03/25',
                                'data': {
                                    '$angularWidth': 40,
                                    '$color': '#88f'
                                },
                                'children': [
                                    {
                                        'id': 'pie404447',
                                        'name': '5',
                                        'data': {
                                            '$angularWidth': 40,
                                            '$color': '#88f'
                                        },
                                        'children': []


                                    }]
                            },
                            {
                                'id': 'pie022',
                                'name': '03/27',
                                'data': {
                                    '$angularWidth': 40,
                                    '$color': '#88f'
                                },
                                'children': [
                                    {
                                        'id': 'pie4015',
                                        'name': '0',
                                        'data': {
                                            '$angularWidth': 40,
                                            '$color': '#88f'
                                        },
                                        'children': []


                                    }]
                            },
                            {
                                'id': 'pie12022',
                                'name': '04/21',
                                'data': {
                                    '$angularWidth': 40,
                                    '$color': '#88f'
                                },
                                'children': [
                                    {
                                        'id': 'pie401312',
                                        'name': '0',
                                        'data': {
                                            '$angularWidth': 40,
                                            '$color': '#88f'
                                        },
                                        'children': []


                                    }]
                            },
                            {
                                'id': 'pie2154',
                                'name': '05/01',
                                'data': {
                                    '$angularWidth': 40,
                                    '$color': '#88f'
                                },
                                'children': [
                                    {
                                        'id': 'pie25450',
                                        'name': '0',
                                        'data': {
                                            '$angularWidth': 40,
                                            '$color': '#88f'
                                        },
                                        'children': []


                                    }]
                            },
                            {
                                'id': 'pie9090',
                                'name': '05/26',
                                'data': {
                                    '$angularWidth': 40,
                                    '$color': '#88f'
                                },
                                'children': [
                                    {
                                        'id': 'pie98487',
                                        'name': '0',
                                        'data': {
                                            '$angularWidth': 40,
                                            '$color': '#88f'
                                        },
                                        'children': []


                                    }]
                            },
                            {
                                'id': 'pie0022',
                                'name': '09/07',
                                'data': {
                                    '$angularWidth': 40,
                                    '$color': '#88f'
                                },
                                'children': [
                                    {
                                        'id': 'pie01010',
                                        'name': '0',
                                        'data': {
                                            '$angularWidth': 40,
                                            '$color': '#88f'
                                        },
                                        'children': []


                                    }]
                            },
                            {
                                'id': 'pie08392',
                                'name': '10/12',
                                'data': {
                                    '$angularWidth': 40,
                                    '$color': '#88f'
                                },
                                'children': [
                                    {
                                        'id': 'pie15875',
                                        'name': '0',
                                        'data': {
                                            '$angularWidth': 40,
                                            '$color': '#88f'
                                        },
                                        'children': []


                                    }]
                            },
                            {
                                'id': 'pie9304782',
                                'name': '11/02',
                                'data': {
                                    '$angularWidth': 40,
                                    '$color': '#88f'
                                },
                                'children': [
                                    {
                                        'id': 'pie419892',
                                        'name': '0',
                                        'data': {
                                            '$angularWidth': 40,
                                            '$color': '#88f'
                                        },
                                        'children': []


                                    }]
                            },
                            {
                                'id': 'pie038483',
                                'name': '11/15',
                                'data': {
                                    '$angularWidth': 40,
                                    '$color': '#88f'
                                },
                                'children': [
                                    {
                                        'id': 'pie9388',
                                        'name': '0.6',
                                        'data': {
                                            '$angularWidth': 40,
                                            '$color': '#88f'
                                        },
                                        'children': []


                                    }]
                            },
                            {
                                'id': 'pie02930',
                                'name': '12/25',
                                'data': {
                                    '$angularWidth': 40,
                                    '$color': '#88f'
                                },
                                'children': [
                                    {
                                        'id': 'pie03942',
                                        'name': '2.5',
                                        'data': {
                                            '$angularWidth': 40,
                                            '$color': '#88f'
                                        },
                                        'children': []


                                    }]
                            }]
                    },
                    {
                        'id': 'pie0404',
                        'name': '2017',
                        'data': {
                            '$angularWidth': 10,
                            '$color': '#77f'
                        },
                        'children': [
                            {
                                'id': 'pie8010',
                                'name': '01/01',
                                'data': {
                                    '$angularWidth': 40,
                                    '$color': '#88f'
                                },
                                'children': [
                                    {
                                        'id': 'pie80441',
                                        'name': '0.2',
                                        'data': {
                                            '$angularWidth': 40,
                                            '$color': '#88f'
                                        },
                                        'children': []


                                    }]

                            },
                            {
                                'id': 'pie0838',
                                'name': '04/14',
                                'data': {
                                    '$angularWidth': 40,
                                    '$color': '#88f'
                                },
                                'children': [
                                    {
                                        'id': 'pie0942',
                                        'name': '0',
                                        'data': {
                                            '$angularWidth': 40,
                                            '$color': '#88f'
                                        },
                                        'children': []


                                    }]
                            },
                            {
                                'id': 'pie030',
                                'name': '04/21',
                                'data': {
                                    '$angularWidth': 40,
                                    '$color': '#88f'
                                },
                                'children': [
                                    {
                                        'id': 'pie032',
                                        'name': '7.2',
                                        'data': {
                                            '$angularWidth': 40,
                                            '$color': '#88f'
                                        },
                                        'children': []


                                    }]
                            },
                            {
                                'id': 'pie0270',
                                'name': '05/01',
                                'data': {
                                    '$angularWidth': 40,
                                    '$color': '#88f'
                                },
                                'children': [
                                    {
                                        'id': 'pie0372',
                                        'name': '0',
                                        'data': {
                                            '$angularWidth': 40,
                                            '$color': '#88f'
                                        },
                                        'children': []


                                    }]
                            },
                            {
                                'id': 'pie0244',
                                'name': '06/15',
                                'data': {
                                    '$angularWidth': 40,
                                    '$color': '#88f'
                                },
                                'children': [
                                    {
                                        'id': 'pie04542',
                                        'name': '0',
                                        'data': {
                                            '$angularWidth': 40,
                                            '$color': '#88f'
                                        },
                                        'children': []


                                    }]
                            },
                            {
                                'id': 'pie0255',
                                'name': '09/07',
                                'data': {
                                    '$angularWidth': 40,
                                    '$color': '#88f'
                                },
                                'children': [
                                    {
                                        'id': 'pie0344',
                                        'name': '0',
                                        'data': {
                                            '$angularWidth': 40,
                                            '$color': '#88f'
                                        },
                                        'children': []


                                    }]
                            },
                            {
                                'id': 'pie09630',
                                'name': '10/12',
                                'data': {
                                    '$angularWidth': 40,
                                    '$color': '#88f'
                                },
                                'children': [
                                    {
                                        'id': 'pie05542',
                                        'name': '44.5',
                                        'data': {
                                            '$angularWidth': 40,
                                            '$color': '#88f'
                                        },
                                        'children': []


                                    }]
                            },
                            {
                                'id': 'pie0444',
                                'name': '11/02',
                                'data': {
                                    '$angularWidth': 40,
                                    '$color': '#88f'
                                },
                                'children': [
                                    {
                                        'id': 'pie44442',
                                        'name': '0',
                                        'data': {
                                            '$angularWidth': 40,
                                            '$color': '#88f'
                                        },
                                        'children': []


                                    }]
                            },
                            {
                                'id': 'pie0733',
                                'name': '11/15',
                                'data': {
                                    '$angularWidth': 40,
                                    '$color': '#88f'
                                },
                                'children': [
                                    {
                                        'id': 'pie08294',
                                        'name': '0',
                                        'data': {
                                            '$angularWidth': 40,
                                            '$color': '#88f'
                                        },
                                        'children': []


                                    }]
                            },
                            {
                                'id': 'pie01898',
                                'name': '12/25',
                                'data': {
                                    '$angularWidth': 40,
                                    '$color': '#88f'
                                },
                                'children': [
                                    {
                                        'id': 'pie011991',
                                        'name': '39.6',
                                        'data': {
                                            '$angularWidth': 40,
                                            '$color': '#88f'
                                        },
                                        'children': []


                                    }]
                            }]
                    },
                    {
                        'id': 'pie186863',
                        'name': '2018',
                        'data': {
                            '$angularWidth': 10,
                            '$color': '#77f'
                        },
                        'children': [
                            {
                                'id': 'pie1784704',
                                'name': '01/01',
                                'data': {
                                    '$angularWidth': 40,
                                    '$color': '#88f'
                                },
                                'children': [
                                    {
                                        'id': 'pie17474',
                                        'name': '26.5',
                                        'data': {
                                            '$angularWidth': 40,
                                            '$color': '#88f'
                                        },
                                        'children': []


                                    }]


                            },
                            {
                                'id': 'pie083833',
                                'name': '03/30',
                                'data': {
                                    '$angularWidth': 40,
                                    '$color': '#88f'
                                },
                                'children': [
                                    {
                                        'id': 'pie01155991',
                                        'name': '22.2',
                                        'data': {
                                            '$angularWidth': 40,
                                            '$color': '#88f'
                                        },
                                        'children': []


                                    }]
                            },
                            {
                                'id': 'pie123198',
                                'name': '04/01',
                                'data': {
                                    '$angularWidth': 40,
                                    '$color': '#88f'
                                },
                                'children': [
                                    {
                                        'id': 'pie01191231291',
                                        'name': '0',
                                        'data': {
                                            '$angularWidth': 40,
                                            '$color': '#88f'
                                        },
                                        'children': []


                                    }]
                            },
                            {
                                'id': 'pie018984334',
                                'name': '04/21',
                                'data': {
                                    '$angularWidth': 40,
                                    '$color': '#88f'
                                },
                                'children': [
                                    {
                                        'id': 'pie0113434991',
                                        'name': '0',
                                        'data': {
                                            '$angularWidth': 40,
                                            '$color': '#88f'
                                        },
                                        'children': []


                                    }]
                            },
                            {
                                'id': 'pie434301898',
                                'name': '05/01',
                                'data': {
                                    '$angularWidth': 40,
                                    '$color': '#88f'
                                },
                                'children': [
                                    {
                                        'id': 'pie0134341991',
                                        'name': '0',
                                        'data': {
                                            '$angularWidth': 40,
                                            '$color': '#88f'
                                        },
                                        'children': []


                                    }]
                            },
                            {
                                'id': 'pie0184545498',
                                'name': '05/31',
                                'data': {
                                    '$angularWidth': 40,
                                    '$color': '#88f'
                                },
                                'children': [
                                    {
                                        'id': 'pie0119945451',
                                        'name': '0.1',
                                        'data': {
                                            '$angularWidth': 40,
                                            '$color': '#88f'
                                        },
                                        'children': []


                                    }]
                            },
                            {
                                'id': 'pie016767898',
                                'name': '09/07',
                                'data': {
                                    '$angularWidth': 40,
                                    '$color': '#88f'
                                },
                                'children': [
                                    {
                                        'id': 'pie0119967671',
                                        'name': '0',
                                        'data': {
                                            '$angularWidth': 40,
                                            '$color': '#88f'
                                        },
                                        'children': []


                                    }]
                            },
                            {
                                'id': 'pie018988888',
                                'name': '10/12',
                                'data': {
                                    '$angularWidth': 40,
                                    '$color': '#88f'
                                },
                                'children': [
                                    {
                                        'id': 'pie011996661',
                                        'name': '2.2',
                                        'data': {
                                            '$angularWidth': 40,
                                            '$color': '#88f'
                                        },
                                        'children': []


                                    }]
                            },
                            {
                                'id': 'pie013434898',
                                'name': '11/02',
                                'data': {
                                    '$angularWidth': 40,
                                    '$color': '#88f'
                                },
                                'children': [
                                    {
                                        'id': 'pie011934391',
                                        'name': '0',
                                        'data': {
                                            '$angularWidth': 40,
                                            '$color': '#88f'
                                        },
                                        'children': []


                                    }]
                            },
                            {
                                'id': 'pie018953458',
                                'name': '11/15',
                                'data': {
                                    '$angularWidth': 40,
                                    '$color': '#88f'
                                },
                                'children': [
                                    {
                                        'id': 'pie01134545991',
                                        'name': '7.3',
                                        'data': {
                                            '$angularWidth': 40,
                                            '$color': '#88f'
                                        },
                                        'children': []


                                    }]
                            },
                            {
                                'id': 'pie01865657798',
                                'name': '12/25',
                                'data': {
                                    '$angularWidth': 40,
                                    '$color': '#88f'
                                },
                                'children': [
                                    {
                                        'id': 'pie011777791',
                                        'name': '1.5',
                                        'data': {
                                            '$angularWidth': 40,
                                            '$color': '#88f'
                                        },
                                        'children': []


                                    }]
                            }]
                    }]



            },
            {
                'id': 'pie30',
                'name': 'Campo Mourão',
                'data': {
                    '$angularWidth': 10,
                    '$color': '#f99'
                },
                'children': [
                    {
                        'id': 'pie300',
                        'name': '2015',
                        'data': {
                            '$angularWidth': 100,
                            '$color': '#aaf'
                        },
                        'children': [
                            {
                                'id': 'pie40333330',
                                'name': '01/01',
                                'data': {
                                    '$angularWidth': 40,
                                    '$color': '#88f'
                                },
                                'children': [
                                    {
                                        'id': 'pie4133330',
                                        'name': '32.8',
                                        'data': {
                                            '$angularWidth': 40,
                                            '$color': '#88f'
                                        },
                                        'children': []


                                    }]


                            },
                            {
                                'id': 'pie40333333330',
                                'name': '04/03',
                                'data': {
                                    '$angularWidth': 40,
                                    '$color': '#88f'
                                },
                                'children': [
                                    {
                                        'id': 'pie41333333330',
                                        'name': '0',
                                        'data': {
                                            '$angularWidth': 40,
                                            '$color': '#88f'
                                        },
                                        'children': []


                                    }]


                            },
                            {
                                'id': 'pie4033344330',
                                'name': '04/05',
                                'data': {
                                    '$angularWidth': 40,
                                    '$color': '#88f'
                                },
                                'children': [
                                    {
                                        'id': 'pie414433330',
                                        'name': '7.5',
                                        'data': {
                                            '$angularWidth': 40,
                                            '$color': '#88f'
                                        },
                                        'children': []


                                    }]


                            },
                            {
                                'id': 'pie4033300330',
                                'name': '04/21',
                                'data': {
                                    '$angularWidth': 40,
                                    '$color': '#88f'
                                },
                                'children': [
                                    {
                                        'id': 'pie413003330',
                                        'name': '0',
                                        'data': {
                                            '$angularWidth': 40,
                                            '$color': '#88f'
                                        },
                                        'children': []


                                    }]


                            },
                            {
                                'id': 'pie40333333555330',
                                'name': '05/01',
                                'data': {
                                    '$angularWidth': 40,
                                    '$color': '#88f'
                                },
                                'children': [
                                    {
                                        'id': 'pie41333333355533330',
                                        'name': '0',
                                        'data': {
                                            '$angularWidth': 40,
                                            '$color': '#88f'
                                        },
                                        'children': []


                                    }]


                            },
                            {
                                'id': 'pie40333333330',
                                'name': '05/01',
                                'data': {
                                    '$angularWidth': 40,
                                    '$color': '#88f'
                                },
                                'children': [
                                    {
                                        'id': 'pie41333333330',
                                        'name': '0',
                                        'data': {
                                            '$angularWidth': 40,
                                            '$color': '#88f'
                                        },
                                        'children': []


                                    }]


                            },
                            {
                                'id': 'pie4033223330',
                                'name': '06/04',
                                'data': {
                                    '$angularWidth': 40,
                                    '$color': '#88f'
                                },
                                'children': [
                                    {
                                        'id': 'pie413332230',
                                        'name': '0',
                                        'data': {
                                            '$angularWidth': 40,
                                            '$color': '#88f'
                                        },
                                        'children': []


                                    }]


                            },
                            {
                                'id': 'pie4110333330',
                                'name': '09/07',
                                'data': {
                                    '$angularWidth': 40,
                                    '$color': '#88f'
                                },
                                'children': [
                                    {
                                        'id': 'pie411133330',
                                        'name': '0',
                                        'data': {
                                            '$angularWidth': 40,
                                            '$color': '#88f'
                                        },
                                        'children': []


                                    }]


                            },
                            {
                                'id': 'pie422230333330',
                                'name': '10/12',
                                'data': {
                                    '$angularWidth': 40,
                                    '$color': '#88f'
                                },
                                'children': [
                                    {
                                        'id': 'pie4223133330',
                                        'name': '40.3',
                                        'data': {
                                            '$angularWidth': 40,
                                            '$color': '#88f'
                                        },
                                        'children': []


                                    }]


                            },
                            {
                                'id': 'pie4011111333330',
                                'name': '11/02',
                                'data': {
                                    '$angularWidth': 40,
                                    '$color': '#88f'
                                },
                                'children': [
                                    {
                                        'id': 'pie41311113330',
                                        'name': '18.4',
                                        'data': {
                                            '$angularWidth': 40,
                                            '$color': '#88f'
                                        },
                                        'children': []


                                    }]


                            },
                            {
                                'id': 'pie4111033333330',
                                'name': '11/15',
                                'data': {
                                    '$angularWidth': 40,
                                    '$color': '#88f'
                                },
                                'children': [
                                    {
                                        'id': 'pie41322333330',
                                        'name': '3.3',
                                        'data': {
                                            '$angularWidth': 40,
                                            '$color': '#88f'
                                        },
                                        'children': []


                                    }]


                            }]
                    },
                    {
                        'id': 'pie1011111',
                        'name': '2016',
                        'data': {
                            '$angularWidth': 70,
                            '$color': '#66f'
                        },
                        'children': [
                            {
                                'id': 'pie4711110',
                                'name': '01/01',
                                'data': {
                                    '$angularWidth': 40,
                                    '$color': '#88f'
                                },
                                'children': [
                                    {
                                        'id': 'pie41111171',
                                        'name': '2.5',
                                        'data': {
                                            '$angularWidth': 40,
                                            '$color': '#88f'
                                        },
                                        'children': []


                                    }]


                            },
                            {
                                'id': 'pie411103333322330',
                                'name': '03/25',
                                'data': {
                                    '$angularWidth': 40,
                                    '$color': '#88f'
                                },
                                'children': [
                                    {
                                        'id': 'pie4132222333330',
                                        'name': '30.3',
                                        'data': {
                                            '$angularWidth': 40,
                                            '$color': '#88f'
                                        },
                                        'children': []


                                    }]


                            },
                            {
                                'id': 'pie4111033322133330',
                                'name': '03/27',
                                'data': {
                                    '$angularWidth': 40,
                                    '$color': '#88f'
                                },
                                'children': [
                                    {
                                        'id': 'pie41322332213330',
                                        'name': '0',
                                        'data': {
                                            '$angularWidth': 40,
                                            '$color': '#88f'
                                        },
                                        'children': []


                                    }]


                            },
                            {
                                'id': 'pie4111333033333330',
                                'name': '04/21',
                                'data': {
                                    '$angularWidth': 40,
                                    '$color': '#88f'
                                },
                                'children': [
                                    {
                                        'id': 'pie4331322333330',
                                        'name': '0',
                                        'data': {
                                            '$angularWidth': 40,
                                            '$color': '#88f'
                                        },
                                        'children': []


                                    }]


                            },
                            {
                                'id': 'pie411103332222133330',
                                'name': '05/01',
                                'data': {
                                    '$angularWidth': 40,
                                    '$color': '#88f'
                                },
                                'children': [
                                    {
                                        'id': 'pie413221233222213330',
                                        'name': '0',
                                        'data': {
                                            '$angularWidth': 40,
                                            '$color': '#88f'
                                        },
                                        'children': []


                                    }]


                            },
                            {
                                'id': 'pie41110312123333330',
                                'name': '05/26',
                                'data': {
                                    '$angularWidth': 40,
                                    '$color': '#88f'
                                },
                                'children': [
                                    {
                                        'id': 'pie413221212333330',
                                        'name': '0',
                                        'data': {
                                            '$angularWidth': 40,
                                            '$color': '#88f'
                                        },
                                        'children': []


                                    }]


                            },
                            {
                                'id': 'pie41110311223333330',
                                'name': '09/07',
                                'data': {
                                    '$angularWidth': 40,
                                    '$color': '#88f'
                                },
                                'children': [
                                    {
                                        'id': 'pie413221121333330',
                                        'name': '0',
                                        'data': {
                                            '$angularWidth': 40,
                                            '$color': '#88f'
                                        },
                                        'children': []


                                    }]


                            },
                            {
                                'id': 'pie41110332323333330',
                                'name': '10/12',
                                'data': {
                                    '$angularWidth': 40,
                                    '$color': '#88f'
                                },
                                'children': [
                                    {
                                        'id': 'pie413223323233330',
                                        'name': '4',
                                        'data': {
                                            '$angularWidth': 40,
                                            '$color': '#88f'
                                        },
                                        'children': []


                                    }]


                            },
                            {
                                'id': 'pie4111031212123333330',
                                'name': '10/02',
                                'data': {
                                    '$angularWidth': 40,
                                    '$color': '#88f'
                                },
                                'children': [
                                    {
                                        'id': 'pie41322312121233330',
                                        'name': '0',
                                        'data': {
                                            '$angularWidth': 40,
                                            '$color': '#88f'
                                        },
                                        'children': []


                                    }]


                            },
                            {
                                'id': 'pie41110367673333330',
                                'name': '11/15',
                                'data': {
                                    '$angularWidth': 40,
                                    '$color': '#88f'
                                },
                                'children': [
                                    {
                                        'id': 'pie413676722333330',
                                        'name': '0',
                                        'data': {
                                            '$angularWidth': 40,
                                            '$color': '#88f'
                                        },
                                        'children': []


                                    }]


                            }]
                    }]
            },
            {
                'id': 'pie40',
                'name': 'Castro',
                'data': {
                    '$angularWidth': 10,
                    '$color': '#f99'
                },
                'children': [
                    {
                        'id': 'pie1023230',
                        'name': '2015',
                        'data': {
                            '$angularWidth': 20,
                            '$color': '#55f'
                        },
                        'children': [
                            {
                                'id': 'pie4023230',
                                'name': '01/01',
                                'data': {
                                    '$angularWidth': 40,
                                    '$color': '#88f'
                                },
                                'children': [
                                    {
                                        'id': 'pie412323230',
                                        'name': '4.6',
                                        'data': {
                                            '$angularWidth': 40,
                                            '$color': '#88f'
                                        },
                                        'children': []


                                    }]


                            },
                            {
                                'id': 'pie411103232367673333330',
                                'name': '04/03',
                                'data': {
                                    '$angularWidth': 40,
                                    '$color': '#88f'
                                },
                                'children': [
                                    {
                                        'id': 'pie4136767221213232333330',
                                        'name': '0',
                                        'data': {
                                            '$angularWidth': 40,
                                            '$color': '#88f'
                                        },
                                        'children': []


                                    }]


                            },
                            {
                                'id': 'pie41133310367673333330',
                                'name': '04/05',
                                'data': {
                                    '$angularWidth': 40,
                                    '$color': '#88f'
                                },
                                'children': [
                                    {
                                        'id': 'pie413673336722333330',
                                        'name': '0.2',
                                        'data': {
                                            '$angularWidth': 40,
                                            '$color': '#88f'
                                        },
                                        'children': []


                                    }]


                            },
                            {
                                'id': 'pie411103676733344443330',
                                'name': '04/21',
                                'data': {
                                    '$angularWidth': 40,
                                    '$color': '#88f'
                                },
                                'children': [
                                    {
                                        'id': 'pie413676744422333330',
                                        'name': '6.8',
                                        'data': {
                                            '$angularWidth': 40,
                                            '$color': '#88f'
                                        },
                                        'children': []


                                    }]


                            },
                            {
                                'id': 'pie411103674343673333330',
                                'name': '05/01',
                                'data': {
                                    '$angularWidth': 40,
                                    '$color': '#88f'
                                },
                                'children': [
                                    {
                                        'id': 'pie4136767343422333330',
                                        'name': '0',
                                        'data': {
                                            '$angularWidth': 40,
                                            '$color': '#88f'
                                        },
                                        'children': []


                                    }]


                            },
                            {
                                'id': 'pie411103545467673333330',
                                'name': '06/04',
                                'data': {
                                    '$angularWidth': 40,
                                    '$color': '#88f'
                                },
                                'children': [
                                    {
                                        'id': 'pie4134545676722333330',
                                        'name': '0.3',
                                        'data': {
                                            '$angularWidth': 40,
                                            '$color': '#88f'
                                        },
                                        'children': []


                                    }]


                            },
                            {
                                'id': 'pie4111434340367673333330',
                                'name': '09/07',
                                'data': {
                                    '$angularWidth': 40,
                                    '$color': '#88f'
                                },
                                'children': [
                                    {
                                        'id': 'pie4136734346722333330',
                                        'name': '0',
                                        'data': {
                                            '$angularWidth': 40,
                                            '$color': '#88f'
                                        },
                                        'children': []


                                    }]


                            },
                            {
                                'id': 'pie411103676734343434333330',
                                'name': '10/12',
                                'data': {
                                    '$angularWidth': 40,
                                    '$color': '#88f'
                                },
                                'children': [
                                    {
                                        'id': 'pie4136767234342333330',
                                        'name': '64.7',
                                        'data': {
                                            '$angularWidth': 40,
                                            '$color': '#88f'
                                        },
                                        'children': []


                                    }]


                            },
                            {
                                'id': 'pie4111036765454573333330',
                                'name': '11/02',
                                'data': {
                                    '$angularWidth': 40,
                                    '$color': '#88f'
                                },
                                'children': [
                                    {
                                        'id': 'pie4136767224545333330',
                                        'name': '4.4',
                                        'data': {
                                            '$angularWidth': 40,
                                            '$color': '#88f'
                                        },
                                        'children': []


                                    }]


                            },
                            {
                                'id': 'pie4111036767334343433330',
                                'name': '11/15',
                                'data': {
                                    '$angularWidth': 40,
                                    '$color': '#88f'
                                },
                                'children': [
                                    {
                                        'id': 'pie413676722334343433330',
                                        'name': '5',
                                        'data': {
                                            '$angularWidth': 40,
                                            '$color': '#88f'
                                        },
                                        'children': []


                                    }]


                            },
                            {
                                'id': 'pie4111036767333387878330',
                                'name': '12/25',
                                'data': {
                                    '$angularWidth': 40,
                                    '$color': '#88f'
                                },
                                'children': [
                                    {
                                        'id': 'pie4136767223787833330',
                                        'name': '1.5',
                                        'data': {
                                            '$angularWidth': 40,
                                            '$color': '#88f'
                                        },
                                        'children': []


                                    }]


                            }]
                    },
                    {
                        'id': 'pie10545451',
                        'name': '2016',
                        'data': {
                            '$angularWidth': 70,
                            '$color': '#66f'
                        },
                        'children': [
                            {
                                'id': 'pie4745450',
                                'name': '01/01',
                                'data': {
                                    '$angularWidth': 40,
                                    '$color': '#88f'
                                },
                                'children': [
                                    {
                                        'id': 'pie4745451',
                                        'name': '0.3',
                                        'data': {
                                            '$angularWidth': 40,
                                            '$color': '#88f'
                                        },
                                        'children': []


                                    }]
                            },
                            {
                                'id': 'pie41110367673334343387878330',
                                'name': '03/25',
                                'data': {
                                    '$angularWidth': 40,
                                    '$color': '#88f'
                                },
                                'children': [
                                    {
                                        'id': 'pie41367643437223787833330',
                                        'name': '17',
                                        'data': {
                                            '$angularWidth': 40,
                                            '$color': '#88f'
                                        },
                                        'children': []


                                    }]


                            },
                            {
                                'id': 'pie41110367878330',
                                'name': '04/21',
                                'data': {
                                    '$angularWidth': 40,
                                    '$color': '#88f'
                                },
                                'children': [
                                    {
                                        'id': 'pie413676330',
                                        'name': '0',
                                        'data': {
                                            '$angularWidth': 40,
                                            '$color': '#88f'
                                        },
                                        'children': []


                                    }]


                            },
                            {
                                'id': 'pie411103676447333387878330',
                                'name': '05/26',
                                'data': {
                                    '$angularWidth': 40,
                                    '$color': '#88f'
                                },
                                'children': [
                                    {
                                        'id': 'pie4136764447223787833330',
                                        'name': '0',
                                        'data': {
                                            '$angularWidth': 40,
                                            '$color': '#88f'
                                        },
                                        'children': []


                                    }]


                            },
                            {
                                'id': 'pie411103387878330',
                                'name': '09/07',
                                'data': {
                                    '$angularWidth': 40,
                                    '$color': '#88f'
                                },
                                'children': [
                                    {
                                        'id': 'pie4137833330',
                                        'name': '0',
                                        'data': {
                                            '$angularWidth': 40,
                                            '$color': '#88f'
                                        },
                                        'children': []


                                    }]


                            },
                            {
                                'id': 'pie411387878330',
                                'name': '10/12',
                                'data': {
                                    '$angularWidth': 40,
                                    '$color': '#88f'
                                },
                                'children': [
                                    {
                                        'id': 'pie4136787833330',
                                        'name': '0.3',
                                        'data': {
                                            '$angularWidth': 40,
                                            '$color': '#88f'
                                        },
                                        'children': []


                                    }]


                            }]

                    },
                    {
                        'id': 'pie10543331',
                        'name': '2017',
                        'data': {
                            '$angularWidth': 70,
                            '$color': '#66f'
                        },
                        'children': [
                            {
                                'id': 'pie4733345450',
                                'name': '04/14',
                                'data': {
                                    '$angularWidth': 40,
                                    '$color': '#88f'
                                },
                                'children': [
                                    {
                                        'id': 'pie4742225451',
                                        'name': '0',
                                        'data': {
                                            '$angularWidth': 40,
                                            '$color': '#88f'
                                        },
                                        'children': []


                                    }]
                            },
                            {
                                'id': 'pie41110367673878330',
                                'name': '04/21',
                                'data': {
                                    '$angularWidth': 40,
                                    '$color': '#88f'
                                },
                                'children': [
                                    {
                                        'id': 'pie413676787833330',
                                        'name': '15.4',
                                        'data': {
                                            '$angularWidth': 40,
                                            '$color': '#88f'
                                        },
                                        'children': []


                                    }]


                            },
                            {
                                'id': 'pie4111036755330',
                                'name': '05/01',
                                'data': {
                                    '$angularWidth': 40,
                                    '$color': '#88f'
                                },
                                'children': [
                                    {
                                        'id': 'pie413666330',
                                        'name': '0',
                                        'data': {
                                            '$angularWidth': 40,
                                            '$color': '#88f'
                                        },
                                        'children': []


                                    }]


                            },
                            {
                                'id': 'pie4111036333387878330',
                                'name': '06/15',
                                'data': {
                                    '$angularWidth': 40,
                                    '$color': '#88f'
                                },
                                'children': [
                                    {
                                        'id': 'pie41367644487833330',
                                        'name': '0',
                                        'data': {
                                            '$angularWidth': 40,
                                            '$color': '#88f'
                                        },
                                        'children': []


                                    }]


                            },
                            {
                                'id': 'pie4111033830',
                                'name': '09/07',
                                'data': {
                                    '$angularWidth': 40,
                                    '$color': '#88f'
                                },
                                'children': [
                                    {
                                        'id': 'pie413784430',
                                        'name': '0',
                                        'data': {
                                            '$angularWidth': 40,
                                            '$color': '#88f'
                                        },
                                        'children': []


                                    }]


                            },
                            {
                                'id': 'pie411388330',
                                'name': '10/12',
                                'data': {
                                    '$angularWidth': 40,
                                    '$color': '#88f'
                                },
                                'children': [
                                    {
                                        'id': 'pie413678330',
                                        'name': '0',
                                        'data': {
                                            '$angularWidth': 40,
                                            '$color': '#88f'
                                        },
                                        'children': []


                                    }]


                            },
                            {
                                'id': 'pie411388222330',
                                'name': '11/02',
                                'data': {
                                    '$angularWidth': 40,
                                    '$color': '#88f'
                                },
                                'children': [
                                    {
                                        'id': 'pie413141678330',
                                        'name': '0',
                                        'data': {
                                            '$angularWidth': 40,
                                            '$color': '#88f'
                                        },
                                        'children': []


                                    }]


                            },
                            {
                                'id': 'pie411376788330',
                                'name': '11/15',
                                'data': {
                                    '$angularWidth': 40,
                                    '$color': '#88f'
                                },
                                'children': [
                                    {
                                        'id': 'pie417673678330',
                                        'name': '0',
                                        'data': {
                                            '$angularWidth': 40,
                                            '$color': '#88f'
                                        },
                                        'children': []


                                    }]


                            }]

                    },
                    {
                        'id': 'pie1086863',
                        'name': '2018',
                        'data': {
                            '$angularWidth': 10,
                            '$color': '#77f'
                        },
                        'children': [
                            {
                                'id': 'pie106664',
                                'name': '03/30',
                                'data': {
                                    '$angularWidth': 40,
                                    '$color': '#88f'
                                },
                                'children': [
                                    {
                                        'id': 'pie133305',
                                        'name': '0.8',
                                        'data': {
                                            '$angularWidth': 40,
                                            '$color': '#88f'
                                        },
                                        'children': []


                                    }]


                            },
                            {
                                'id': 'pie1577777',
                                'name': '04/21',
                                'data': {
                                    '$angularWidth': 40,
                                    '$color': '#88f'
                                },
                                'children': [
                                    {
                                        'id': 'pie143333789',
                                        'name': '0',
                                        'data': {
                                            '$angularWidth': 40,
                                            '$color': '#88f'
                                        },
                                        'children': []


                                    }]
                            },


                            {
                                'id': 'pie8944481',
                                'name': '05/01',
                                'data': {
                                    '$angularWidth': 40,
                                    '$color': '#88f'
                                },
                                'children': [
                                    {
                                        'id': 'pie79222777',
                                        'name': '0',
                                        'data': {
                                            '$angularWidth': 40,
                                            '$color': '#88f'
                                        },
                                        'children': []


                                    }]
                            },
                            {
                                'id': 'pie871433437',
                                'name': '05/31',
                                'data': {
                                    '$angularWidth': 40,
                                    '$color': '#88f'
                                },
                                'children': [
                                    {
                                        'id': 'pie711334',
                                        'name': '0',
                                        'data': {
                                            '$angularWidth': 40,
                                            '$color': '#88f'
                                        },
                                        'children': []


                                    }]
                            },
                            {
                                'id': 'pie8951515',
                                'name': '09/07',
                                'data': {
                                    '$angularWidth': 40,
                                    '$color': '#88f'
                                },
                                'children': [
                                    {
                                        'id': 'pie79587811',
                                        'name': '0',
                                        'data': {
                                            '$angularWidth': 40,
                                            '$color': '#88f'
                                        },
                                        'children': []


                                    }]
                            },
                            {
                                'id': 'pie8774431',
                                'name': '11/02',
                                'data': {
                                    '$angularWidth': 40,
                                    '$color': '#88f'
                                },
                                'children': [
                                    {
                                        'id': 'pie7848484924',
                                        'name': '1',
                                        'data': {
                                            '$angularWidth': 40,
                                            '$color': '#88f'
                                        },
                                        'children': []


                                    }]
                            },
                            {
                                'id': 'pie232351',
                                'name': '11/15',
                                'data': {
                                    '$angularWidth': 40,
                                    '$color': '#88f'
                                },
                                'children': [
                                    {
                                        'id': 'pie54545',
                                        'name': '0.8',
                                        'data': {
                                            '$angularWidth': 40,
                                            '$color': '#88f'
                                        },
                                        'children': []


                                    }]
                            },
                            {
                                'id': 'pie865234234',
                                'name': '12/25',
                                'data': {
                                    '$angularWidth': 40,
                                    '$color': '#88f'
                                },
                                'children': [
                                    {
                                        'id': 'pie79823423478',
                                        'name': '0',
                                        'data': {
                                            '$angularWidth': 40,
                                            '$color': '#88f'
                                        },
                                        'children': []



                                    }]

                            }]
                    }]
            }]

    };

    var jsonpie = {
        'id': 'root',
        'name': 'RGraph based Pie Chart',
        'data': {
            '$type': 'none'
        },
        'children': [
            {
                'id': 'pie1',
                'name': 'pie1',
                'data': {
                    '$angularWidth': 20,
                    '$color': '#55f'
                },
                'children': []
            },
            {
                'id': 'pie2',
                'name': 'pie2',
                'data': {
                    '$angularWidth': 40,
                    '$color': '#77f'
                },
                'children': []
            },
            {
                'id': 'pie3',
                'name': 'pie3',
                'data': {
                    '$angularWidth': 10,
                    '$color': '#99f'
                },
                'children': []
            },
            {
                'id': 'pie4',
                'name': 'pie4',
                'data': {
                    '$angularWidth': 30,
                    '$color': '#bbf'
                },
                'children': []
            }
        ]
    };
    //end

    //init nodetypes
    //Here we implement custom node rendering types for the RGraph
    //Using this feature requires some javascript and canvas experience.
    $jit.RGraph.Plot.NodeTypes.implement({
        //This node type is used for plotting pie-chart slices as nodes
        'shortnodepie': {
            'render': function (node, canvas) {
                var ldist = this.config.levelDistance;
                var span = node.angleSpan, begin = span.begin, end = span.end;
                var polarNode = node.pos.getp(true);

                var polar = new $jit.Polar(polarNode.rho, begin);
                var p1coord = polar.getc(true);

                polar.theta = end;
                var p2coord = polar.getc(true);

                polar.rho += ldist;
                var p3coord = polar.getc(true);

                polar.theta = begin;
                var p4coord = polar.getc(true);


                var ctx = canvas.getCtx();
                ctx.beginPath();
                ctx.moveTo(p1coord.x, p1coord.y);
                ctx.lineTo(p4coord.x, p4coord.y);
                ctx.moveTo(0, 0);
                ctx.arc(0, 0, polarNode.rho, begin, end, false);

                ctx.moveTo(p2coord.x, p2coord.y);
                ctx.lineTo(p3coord.x, p3coord.y);
                ctx.moveTo(0, 0);
                ctx.arc(0, 0, polarNode.rho + ldist, end, begin, true);

                ctx.fill();
            }
        }
    });

    $jit.ST.Plot.NodeTypes.implement({
        //Create a new node type that renders an entire RGraph visualization
        'piechart': {
            'render': function (node, canvas, animating) {
                var ctx = canvas.getCtx(), pos = node.pos.getc(true);
                ctx.save();
                ctx.translate(pos.x, pos.y);
                pie.plot();
                ctx.restore();
            }
        }
    });
    //end

    //init pie
    var pie = new $jit.RGraph({
        'injectInto': 'infovis',
        //Add node/edge styles and set
        //overridable=true if you want your
        //styles to be individually overriden
        Node: {
            'overridable': true,
            'type': 'shortnodepie'
        },
        Edge: {
            'type': 'none'
        },
        //Parent-children distance
        levelDistance: 15,
        //Don't create labels for this visualization
        withLabels: false,
        //Don't clear the canvas when plotting
        clearCanvas: false
    });
    //load graph.
    pie.loadJSON(jsonpie);
    pie.compute();
    //end

    //init st
    var st = new $jit.ST({
        useCanvas: pie.canvas,
        orientation: 'bottom',
        //Add node/edge styles
        Node: {
            type: 'piechart',
            width: 60,
            height: 60
        },
        Edge: {
            color: '#999',
            type: 'quadratic:begin'
        },
        //Parent-children distance
        levelDistance: 60,

        //Add styles to node labels on label creation
        onCreateLabel: function (domElement, node) {
            //add some styles to the node label
            var style = domElement.style;
            domElement.id = node.id;
            style.color = '#fff';
            style.fontSize = '0.8em';
            style.textAlign = 'center';
            style.width = "60px";
            style.height = "24px";
            style.paddingTop = "22px";
            style.cursor = 'pointer';
            domElement.innerHTML = node.name;
            domElement.onclick = function () {
                st.onClick(node.id, {
                    Move: {
                        offsetY: -90
                    }
                });
            };
        }
    });
    //load json data
    st.loadJSON(json);
    //compute node positions and layout
    st.compute();
    //optional: make a translation of the tree
    st.geom.translate(new $jit.Complex(0, 200), "start");
    //Emulate a click on the root node.
    st.onClick(st.root, {
        Move: {
            offsetY: -90
        }
    });
    //end
}
