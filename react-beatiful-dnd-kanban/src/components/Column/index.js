import React from 'react';
import { Droppable } from 'react-beautiful-dnd';

import Task from '../Task';

import { Container, ColumnDropArea } from './styles';

function Column({ id, column }) {
  return (
    <Container>
      <h2>{column.name}</h2>
      <div>
        <Droppable droppableId={id} key={id}>
          {(provided, snapshot) => {
            return (
              <ColumnDropArea
                {...provided.droppableProps}
                ref={provided.innerRef}
                isDraggingOver={snapshot.isDraggingOver}
              >
                {column.items.map((item, index) => {
                  return (
                    <Task item={item} index={index} />
                  );
                })}
                {provided.placeholder}
              </ColumnDropArea>
            );
          }}
        </Droppable>
      </div>
    </Container>
  );
}

export default Column;