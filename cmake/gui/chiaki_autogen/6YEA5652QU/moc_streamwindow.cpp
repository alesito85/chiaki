/****************************************************************************
** Meta object code from reading C++ file 'streamwindow.h'
**
** Created by: The Qt Meta Object Compiler version 67 (Qt 5.15.3)
**
** WARNING! All changes made in this file will be lost!
*****************************************************************************/

#include <memory>
#include "../../../../gui/include/streamwindow.h"
#include <QtCore/qbytearray.h>
#include <QtCore/qmetatype.h>
#if !defined(Q_MOC_OUTPUT_REVISION)
#error "The header file 'streamwindow.h' doesn't include <QObject>."
#elif Q_MOC_OUTPUT_REVISION != 67
#error "This file was generated using the moc from 5.15.3. It"
#error "cannot be used with the include files from this version of Qt."
#error "(The moc has changed too much.)"
#endif

QT_BEGIN_MOC_NAMESPACE
QT_WARNING_PUSH
QT_WARNING_DISABLE_DEPRECATED
struct qt_meta_stringdata_StreamWindow_t {
    QByteArrayData data[12];
    char stringdata0[136];
};
#define QT_MOC_LITERAL(idx, ofs, len) \
    Q_STATIC_BYTE_ARRAY_DATA_HEADER_INITIALIZER_WITH_OFFSET(len, \
    qptrdiff(offsetof(qt_meta_stringdata_StreamWindow_t, stringdata0) + ofs \
        - idx * sizeof(QByteArrayData)) \
    )
static const qt_meta_stringdata_StreamWindow_t qt_meta_stringdata_StreamWindow = {
    {
QT_MOC_LITERAL(0, 0, 12), // "StreamWindow"
QT_MOC_LITERAL(1, 13, 11), // "SessionQuit"
QT_MOC_LITERAL(2, 25, 0), // ""
QT_MOC_LITERAL(3, 26, 16), // "ChiakiQuitReason"
QT_MOC_LITERAL(4, 43, 6), // "reason"
QT_MOC_LITERAL(5, 50, 10), // "reason_str"
QT_MOC_LITERAL(6, 61, 17), // "LoginPINRequested"
QT_MOC_LITERAL(7, 79, 9), // "incorrect"
QT_MOC_LITERAL(8, 89, 16), // "ToggleFullscreen"
QT_MOC_LITERAL(9, 106, 13), // "ToggleStretch"
QT_MOC_LITERAL(10, 120, 10), // "ToggleZoom"
QT_MOC_LITERAL(11, 131, 4) // "Quit"

    },
    "StreamWindow\0SessionQuit\0\0ChiakiQuitReason\0"
    "reason\0reason_str\0LoginPINRequested\0"
    "incorrect\0ToggleFullscreen\0ToggleStretch\0"
    "ToggleZoom\0Quit"
};
#undef QT_MOC_LITERAL

static const uint qt_meta_data_StreamWindow[] = {

 // content:
       8,       // revision
       0,       // classname
       0,    0, // classinfo
       6,   14, // methods
       0,    0, // properties
       0,    0, // enums/sets
       0,    0, // constructors
       0,       // flags
       0,       // signalCount

 // slots: name, argc, parameters, tag, flags
       1,    2,   44,    2, 0x08 /* Private */,
       6,    1,   49,    2, 0x08 /* Private */,
       8,    0,   52,    2, 0x08 /* Private */,
       9,    0,   53,    2, 0x08 /* Private */,
      10,    0,   54,    2, 0x08 /* Private */,
      11,    0,   55,    2, 0x08 /* Private */,

 // slots: parameters
    QMetaType::Void, 0x80000000 | 3, QMetaType::QString,    4,    5,
    QMetaType::Void, QMetaType::Bool,    7,
    QMetaType::Void,
    QMetaType::Void,
    QMetaType::Void,
    QMetaType::Void,

       0        // eod
};

void StreamWindow::qt_static_metacall(QObject *_o, QMetaObject::Call _c, int _id, void **_a)
{
    if (_c == QMetaObject::InvokeMetaMethod) {
        auto *_t = static_cast<StreamWindow *>(_o);
        (void)_t;
        switch (_id) {
        case 0: _t->SessionQuit((*reinterpret_cast< ChiakiQuitReason(*)>(_a[1])),(*reinterpret_cast< const QString(*)>(_a[2]))); break;
        case 1: _t->LoginPINRequested((*reinterpret_cast< bool(*)>(_a[1]))); break;
        case 2: _t->ToggleFullscreen(); break;
        case 3: _t->ToggleStretch(); break;
        case 4: _t->ToggleZoom(); break;
        case 5: _t->Quit(); break;
        default: ;
        }
    } else if (_c == QMetaObject::RegisterMethodArgumentMetaType) {
        switch (_id) {
        default: *reinterpret_cast<int*>(_a[0]) = -1; break;
        case 0:
            switch (*reinterpret_cast<int*>(_a[1])) {
            default: *reinterpret_cast<int*>(_a[0]) = -1; break;
            case 0:
                *reinterpret_cast<int*>(_a[0]) = qRegisterMetaType< ChiakiQuitReason >(); break;
            }
            break;
        }
    }
}

QT_INIT_METAOBJECT const QMetaObject StreamWindow::staticMetaObject = { {
    QMetaObject::SuperData::link<QMainWindow::staticMetaObject>(),
    qt_meta_stringdata_StreamWindow.data,
    qt_meta_data_StreamWindow,
    qt_static_metacall,
    nullptr,
    nullptr
} };


const QMetaObject *StreamWindow::metaObject() const
{
    return QObject::d_ptr->metaObject ? QObject::d_ptr->dynamicMetaObject() : &staticMetaObject;
}

void *StreamWindow::qt_metacast(const char *_clname)
{
    if (!_clname) return nullptr;
    if (!strcmp(_clname, qt_meta_stringdata_StreamWindow.stringdata0))
        return static_cast<void*>(this);
    return QMainWindow::qt_metacast(_clname);
}

int StreamWindow::qt_metacall(QMetaObject::Call _c, int _id, void **_a)
{
    _id = QMainWindow::qt_metacall(_c, _id, _a);
    if (_id < 0)
        return _id;
    if (_c == QMetaObject::InvokeMetaMethod) {
        if (_id < 6)
            qt_static_metacall(this, _c, _id, _a);
        _id -= 6;
    } else if (_c == QMetaObject::RegisterMethodArgumentMetaType) {
        if (_id < 6)
            qt_static_metacall(this, _c, _id, _a);
        _id -= 6;
    }
    return _id;
}
QT_WARNING_POP
QT_END_MOC_NAMESPACE
