import React, { useState } from 'react';
import { DragDropContext } from 'react-beautiful-dnd';
import uuid from 'uuid/dist/v4';
import Column from './components/Column';

import { onDragEnd } from './handlers/drag';

import { DivApp } from './style.js';

const itemsFromBackend = [
  { id: uuid(), content: 'First task' },
  { id: uuid(), content: 'Second task' },
];

const columnsFromBackend = {
  [uuid()]: {
    name: 'Todo',
    items: itemsFromBackend
  },
  [uuid()]: {
    name: 'In Progress',
    items: []
  },
  [uuid()]: {
    name: 'Done',
    items: []
  }
};

function App() {
  const [columns, setColumns] = useState(columnsFromBackend);

  return (
    <DivApp>
      <DragDropContext onDragEnd={result => onDragEnd(result, columns, setColumns)}>
        {Object.entries(columns).map(([id, column]) => (
            <Column id={id} column={column} />
        ))}
      </DragDropContext>
    </DivApp>
  );
}

export default App;
