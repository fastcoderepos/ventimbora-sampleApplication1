cube(`Inventory`, {
  sql: `SELECT * FROM public.inventory`,

  joins: {
    Film: {
      sql: `${CUBE}.film_id = ${Film}.film_id`,
      relationship: `belongsTo`,
    },

    Store: {
      sql: `${CUBE}.store_id = ${Store}.store_id`,
      relationship: `belongsTo`,
    },
  },

  measures: {
    min_last_update: {
      sql: 'last_update',
      type: 'min',
    },
    max_last_update: {
      sql: 'last_update',
      type: 'max',
    },
    count_last_update: {
      sql: 'last_update',
      type: 'count',
    },
    countDistinct_last_update: {
      sql: 'last_update',
      type: 'countDistinct',
    },
    countDistinctApprox_last_update: {
      sql: 'last_update',
      type: 'countDistinctApprox',
    },
    sum_inventory_id: {
      sql: 'inventory_id',
      type: 'sum',
    },
    avg_inventory_id: {
      sql: 'inventory_id',
      type: 'avg',
    },
    min_inventory_id: {
      sql: 'inventory_id',
      type: 'min',
    },
    max_inventory_id: {
      sql: 'inventory_id',
      type: 'max',
    },
    runningTotal_inventory_id: {
      sql: 'inventory_id',
      type: 'runningTotal',
    },
    count_inventory_id: {
      sql: 'inventory_id',
      type: 'count',
    },
    countDistinct_inventory_id: {
      sql: 'inventory_id',
      type: 'countDistinct',
    },
    countDistinctApprox_inventory_id: {
      sql: 'inventory_id',
      type: 'countDistinctApprox',
    },
  },

  dimensions: {
    lastUpdate: {
      sql: `last_update`,
      type: `time`,
    },

    inventory_id: {
      sql: `inventory_id`,
      type: `number`,
      primaryKey: true,
    },
  },
});
